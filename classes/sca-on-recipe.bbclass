## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Configuration for static code analysis on recipe-level

inherit sca-global
inherit sca-helper
inherit sca-file-filter
inherit sca-blocklist
inherit sca-deploy-recipe

SCA_ENABLED_MODULES_RECIPE ?= "\
                            bandit \
                            bashate \
                            bitbake \
                            cbmc \
                            checkbashism \
                            cmake \
                            cppcheck \
                            cpplint \
                            cvecheck \
                            darglint \
                            dennis \
                            detectsecrets \
                            flake8 \
                            flawfinder \
                            flint \
                            gcc \
                            golint \
                            jsonlint \
                            kconfighard \
                            licensecheck \
                            looong \
                            msgcheck \
                            multimetric \
                            mypy \
                            oelint \
                            perl \
                            perlcritic \
                            pkgqaenc \
                            pscan \
                            pylint \
                            pysymcheck \
                            rats \
                            reuse \
                            revive \
                            ruff \
                            scancode \
                            setuptoolslint \
                            shellcheck \
                            slick \
                            sparse \
                            stank \
                            systemdlint \
                            tlv \
                            tscancode \
                            vulture \
                            xmllint \
                            yamllint \
                            "
SCA_SOURCES_DIR ?= "${S}"

SCA_MODE = "recipe"
SCA_MODE_UPPER = "${@d.getVar('SCA_MODE').upper()}"
SCA_ACTIVE_MODULES = ""
SCA_SDKGEN_TASKS = ""

def sca_sdkgen_sort_tasks(tasks):
    if not tasks:
        return []
    while True:
        for k, v in tasks.items():
            if isinstance(v, int):
                continue
            sum = 0
            for item in v:
                if item not in tasks:
                    sum += 1
                elif isinstance(tasks[item], int):
                    sum += tasks[item] + 1
                else:
                    sum = -1
                    break
            if sum >= 0:
                tasks[k] = sum
        if not any(isinstance(x, list) for x in tasks.values()):
            break
    # return ordered tree
    return [k for k, _ in sorted(tasks.items(), key=lambda item: item[1])]

def sca_on_recipe_init(d):
    import copy
    import bb

    from bb.parse.parse_py import BBHandler
    enabledModules = []

    _tasks = {}

    if d.getVar("SCA_TOOL_DESCRIPTION"):
        # on the tools itself limit the injected modules + pkgqaenc
        _list = d.getVar("SCA_TOOL_DESCRIPTION")
        if bb.data.inherits_class('nativesdk', d):
            _list += " pkgqaenc"
        d.setVar("SCA_ENABLED_MODULES", _list)
        d.setVar("SCA_AVAILABLE_MODULES", _list)

    for item in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        if not sca_module_applicable(d, item):
            continue
        if sca_is_module_blocklisted(d, item) or not any(sca_filter_by_license(d)):
            continue
        okay = False
        dc = d.createCopy()
        _initial_keys = copy.deepcopy(dc.keys())
        try:
            BBHandler.inherit("sca-{}".format(item), "sca-on-recipe", 1, d)
            func = "sca-{}-init".format(item).replace("-", "_")
            if d.getVar(func, False) is not None:
                bb.build.exec_func(func, d)
            okay = True
        except bb.parse.ParseError:
            pass
        try:
            ## In case there is a split between image/recipe modules
            BBHandler.inherit("sca-{}-recipe".format(item), "sca-on-recipe", 1, d)
            func = "sca-{}-init".format(item).replace("-", "_")
            if d.getVar(func, False) is not None:
                bb.build.exec_func(func, d)
            okay = True
        except bb.parse.ParseError:
            pass
        if okay:
            if bb.data.inherits_class('nativesdk', d) and \
               bb.data.inherits_class('sca-description', d):
                for key in [x for x in d.keys() if x not in _initial_keys]:
                    _flags = d.getVarFlags(key) or {}
                    if "func" in _flags and "task" in _flags and key.startswith("do_sca"):
                        # filter by tool name
                        if "nosdkgen" not in _flags and \
                           (d.getVar("SCA_TOOL_DESCRIPTION") or "doesnotexit") in key:
                            _tasks[key] = d.getVarFlag(key, "deps") or 0
                        # import but not run sca tasks in nativesdk/sca recipes
                        d.setVarFlag(key, "noexec", "1")
            enabledModules.append(item)
    # SDKgen related settings
    d.setVar("SCA_SDKGEN_TASKS", " ".join(sca_sdkgen_sort_tasks(_tasks)))

    if bb.data.inherits_class('nativesdk', d):
        # correct inherit order to avoid insane warnings
        _cache = d.getVar('__inherit_cache', False) or []
        _needle = [x for x in _cache if "nativesdk.bbclass" in x]
        _cache = [x for x in _cache if x not in _needle]
        _cache += _needle
        d.setVar('__inherit_cache', _cache)
    
    if any(enabledModules):
        if d.getVar("SCA_VERBOSE_OUTPUT") == "1":
            bb.note("Using SCA Module(s) {}".format(",".join(sorted(enabledModules))))
    d.appendVar("SCA_ACTIVE_MODULES", " " + " ".join(sorted(enabledModules)))

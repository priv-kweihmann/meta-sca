## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

inherit sca-helper
inherit sca-pkgqaenc-helper

# The following are compiled into the python interpreter
# and don't come with any files
SCA_PKGQAENC_PYIDENT_BUILTINS ?= "\
    __main__ \
    _string \
    _thread \
    atexit \
    builtins \
    errno \
    faulthandler \
    itertools \
    marshal \
    msilib \
    msvcrt \
    posix \
    pwd \
    sys \
    time \
    winreg \
    winsound \
"

def do_sca_pkgqaenc_get_modules_from_path(path_glob, strip_path, _ignore = ["__pycache__"]):
    import glob
    import os

    modules = set()
    if os.path.isdir(path_glob):
        path_glob += "/*"
    _files = glob.glob(path_glob, recursive=True)
    if not _files:
        _files = [path_glob.replace("*", "")]
    for _gfile in _files:
        _name, _ext = os.path.splitext(_gfile)
        if _ext not in [".py", ".so"]:
            continue
        while "." in os.path.basename(_name):
            _name = _name.rsplit(".", 1)[0]
        _gfile_clean = _name.replace(strip_path, "").lstrip("/")
        if _gfile_clean.endswith("__init__"):
            continue
        _clean_name_chunks = [x for x in _gfile_clean.split("/") if x]
        if _clean_name_chunks[0] == "lib-dynload":
            _clean_name_chunks = _clean_name_chunks[1:]
        if any(list(set(_clean_name_chunks).intersection(_ignore))):
            continue
        for i in range(0, len(_clean_name_chunks) - 1):
            for j in range(len(_clean_name_chunks), 0, -1):
                if _clean_name_chunks[i:j]:
                    modules.add(".".join(_clean_name_chunks[i:j]))
        modules.add(_clean_name_chunks[-1])
    return sorted(list(modules))

def do_sca_pkgqaenc_pythonident(d, package):
    import os
    import bb
    import ast

    _package_dir = d.expand("${{PKGDEST}}/{}".format(package))

    _imports = set()
    
    for _file in get_files_by_extention_or_shebang(d, _package_dir, ".*python", [".py"]):
        try:
            bb.note("Check on file {}".format(_file))
            with open(_file, "rb") as f:
                root = ast.parse(f.read(), _file)
                for node in ast.iter_child_nodes(root):
                    if isinstance(node, ast.Import):
                        name = None
                    elif isinstance(node, ast.ImportFrom):  
                        name = node.module
                    else:
                        continue
                    for n in node.names:
                        _imports.add(name or n.name)
        except Exception as e:
            sca_log_note(d, str(e))
    
    if not d.getVar("PYTHON_SITEPACKAGES_DIR"):
        return ""
   
    # the modules code itself to the module list
    _gfull_path_base = os.path.join(_package_dir, d.getVar("PYTHON_SITEPACKAGES_DIR").lstrip("/"))
    if os.path.exists(_gfull_path_base):
        _self_provided = do_sca_pkgqaenc_get_modules_from_path(_gfull_path_base + "/**/*.py", _gfull_path_base) + \
                                do_sca_pkgqaenc_get_modules_from_path(_gfull_path_base + "/**/*.so", _gfull_path_base)
    _imports = list(_imports)

    if not any(_imports):
        return ""

    _pkg_in_rdepends = clean_split(d, "RDEPENDS:{}".format(package))

    res = ""

    builtins = clean_split(d, "SCA_PKGQAENC_PYIDENT_BUILTINS")

    for _imp in sorted(_imports):
        _chunks = _imp.split(".")
        satisfied_by_self = False
        third_party_packages = set()

        _needles = [("/".join(_chunks) + ".py", ""),
                    ("/".join(_chunks) + "/__init__.py", ""),
                    ("lib-dynload/" + _chunks[-1], "\..*\.so"),
                    ("lib-dynload/_" + _chunks[-1], "\..*\.so")
                    ]
        if len(_chunks) > 1:
            _needles += [("/".join(_chunks[0:-1]) + ".py", ""),
                         ("/".join(_chunks[0:-1]) + "/__init__.py", ""),
                         ("lib-dynload/" + _chunks[-2], "\..*\.so"),
                         ("lib-dynload/_" + _chunks[-2], "\..*\.so")
                        ]

        # Try to map against known errata
        if _imp in builtins:
            if bb.data.inherits_class('nativesdk', d):
                third_party_packages.add("nativesdk-python3-core")
            else:
                third_party_packages.add("python3-core")
        else:
            for needle in _needles:
                _self_served = do_sca_pkgqaenc_is_provided_by_self(d, needle[0], package, isexec=False, suffix=needle[1])
                if not _self_served:
                    third_party_packages.update([x for x in do_sca_pkgqaenc_pkg_for_file(d, needle[0], suffix=needle[1]) if x != package])
                satisfied_by_self = _self_served
                if satisfied_by_self:
                    break
        if not satisfied_by_self:
            found = any(x in _pkg_in_rdepends for x in third_party_packages)
            bb.debug(2, "{}, found {}, pkgs {}".format(_imp, found, third_party_packages))
            if not found:
                if third_party_packages:
                    if len(third_party_packages) > 1:
                        prov_string = "one of {}".format(",".join(sorted(third_party_packages)))
                    else:
                        prov_string = ",".join(third_party_packages)
                    res += do_sca_pkgqaenc_warning("pkgqaenc.pkgqaenc.missingprodiver", _package_dir,
                                                    "Package {pkg} uses {imp}, that requires {prov} set in RDEPENDS:{pkg}".format(
                                                        imp=_imp, pkg=package, prov=prov_string))
                else:
                    res += do_sca_pkgqaenc_warning("pkgqaenc.pkgqaenc.missingprodiver", _package_dir,
                                                    "Package {pkg} uses {imp}, but no provider for this file can be found".format(
                                                        imp=_imp, pkg=package))
    return res

do_sca_pkgqaenc_core[depends] += "${@oe.utils.ifelse(d.getVar('PYTHON_SITEPACKAGES_DIR'), 'python3:do_package', '')}"

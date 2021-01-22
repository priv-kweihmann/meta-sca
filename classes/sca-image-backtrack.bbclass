## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

## Backtrack findings from image to the original recipes

inherit sca-global
inherit sca-license-image-helper

def sca_backtrack_image_init(d):
    import json
    import glob
    import oe.packagedata

    if d.getVar("SCA_BACKTRACK") != "1":
        return {}

    with open(d.getVar("SCA_IMAGE_PKG_LIST")) as i:
        pack_list = json.load(i)

    _result = {}

    _map = {}
    for item in glob.glob(os.path.join(d.getVar("PKGDATA_DIR"), "runtime", "*")):
        x = oe.packagedata.read_subpkgdata_dict(os.path.basename(item), d)
        if "PKG" in x:
            _map[x["PKG"]] = os.path.basename(item)

    for item in pack_list.keys():
        _item = _map[item] if item in _map else item
        pkgdata = oe.packagedata.read_subpkgdata_dict(_item, d)
        if "FILES_INFO" in pkgdata:
            file_list = pkgdata["FILES_INFO"]
            if isinstance(file_list, str):
                import ast
                file_list = ast.literal_eval(file_list)

            for n in file_list.keys():
                _recipe = oe.packagedata.recipename(_item, d)
                _rawpath = "${{BASE_WORKDIR}}/{arch}${{TARGET_VENDOR}}-${{TARGET_OS}}/{recipe}/{version}/image/".format(
                            arch=pack_list[item]["arch"],
                            recipe=_recipe,
                            version=pack_list[item]["ver"].replace(":", "_")
                )
                _result[n.lstrip("/")] = (_recipe, d.expand(_rawpath))
    return _result

def sca_backtrack_bbfiles(d):
    import glob
    import json
    _result = {}
    for _file in glob.glob(d.expand("${SCA_EXPORT_DIR}/*/datamodel/*.dm")):
        with open(_file) as i:
            for j in json.load(i):
                _result[j["PackageName"]] = j.get("BBFiles", [])
                break
    return _result

# Adds additional findings if the findings can be backtracked
# to a recipe
def sca_backtrack_findings(d, g):
    import copy
    res = [g]
    if d.getVar("SCA_BACKTRACK") != "1" or not bb.data.inherits_class('image', d):
        return res
    sca_backtrack_findings.map = getattr(sca_backtrack_findings, 'map', sca_backtrack_image_init(d))
    sca_backtrack_findings.bbmap = getattr(sca_backtrack_findings, 'bbmap', sca_backtrack_bbfiles(d))

    if g.File.lstrip("/") in sca_backtrack_findings.map:
        h = copy.deepcopy(g)
        h.PackageName, h.BuildPath = sca_backtrack_findings.map[h.File.lstrip("/")]
        h.BBFiles = sca_backtrack_findings.bbmap.get(h.PackageName, [])
        bb.debug(1, "Backtracked to {} -> {}".format(h.PackageName, h.BuildPath))
        res.append(h)
    return res

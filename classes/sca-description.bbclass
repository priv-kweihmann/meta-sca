## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

python do_sca_tool_description() {
    import json
    import glob
    import re

    if bb.data.inherits_class('native', d):
        # do some sanity checking
        return

    for item in glob.glob(d.expand("${D}${datadir}/*.sca.description")):
        cnt = {}
        with open(item) as i:
            cnt = json.load(i)
        cnt["version"] = d.getVar("PV")
        cnt["description"] = d.getVar("DESCRIPTION") or d.getVar("SUMMARY")
        cnt["description"] = re.sub(r"\\n", " ", cnt["description"])
        cnt["description"] = re.sub(r"\s{2,}", " ", cnt["description"])
        cnt["description"] = cnt["description"].rstrip(".")
        cnt["homepage"] = d.getVar("HOMEPAGE") or "https://github.com/priv-kweihmann/meta-sca"
        with open(item, "w") as o:
            json.dump(cnt, o, sort_keys=True, indent=2)
}

do_sca_tool_description[doc] = "Adds dynamic information such as version into the sca-tool description"
addtask do_sca_tool_description after do_install before do_populate_sysroot
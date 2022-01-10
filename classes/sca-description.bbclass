## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

SCA_TOOL_DESCRIPTION ?= ""

SRC_URI:append:class-native = " file://${SCA_TOOL_DESCRIPTION}.sca.description"

python do_sca_tool_description() {
    # this does nothing for non-native builds
    pass
}

python do_sca_tool_description:class-native() {
    import json
    import glob
    import re

    for item in glob.glob(d.expand("${WORKDIR}/${SCA_TOOL_DESCRIPTION}.sca.description")):
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
addtask do_sca_tool_description after do_patch before do_install

do_install:append:class-native() {
    install -d ${D}${datadir}
    if [ -e ${WORKDIR}/${SCA_TOOL_DESCRIPTION}.sca.description ]; then
        install -m 0644 ${WORKDIR}/${SCA_TOOL_DESCRIPTION}.sca.description ${D}${datadir}
    fi
}

FILES:${PN}:class-native += "${datadir}"

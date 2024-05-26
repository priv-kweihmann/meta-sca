## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

inherit sca-sdk-script-gen

SCA_TOOL_DESCRIPTION ?= ""

S ?= "${WORKDIR}/${BP}"
UNPACKDIR ??= "${WORKDIR}/${BP}"
SRC_URI:append = " file://${SCA_TOOL_DESCRIPTION}.sca.description;destsuffix=${BP}"

python do_sca_tool_description() {
    import json
    import glob
    import re

    for item in glob.glob(d.expand("${UNPACKDIR}/${SCA_TOOL_DESCRIPTION}.sca.description")):
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

do_install:append() {
    install -d ${D}${datadir}
    if [ -e ${UNPACKDIR}/${SCA_TOOL_DESCRIPTION}.sca.description ]; then
        install -m 0644 ${UNPACKDIR}/${SCA_TOOL_DESCRIPTION}.sca.description ${D}${datadir}
    fi
}

FILES:${PN}:append = " ${datadir}"

PROVIDES:class-nativesdk += "${PN}"
ALLOW_EMPTY:${PN}:class-nativesdk = "1"

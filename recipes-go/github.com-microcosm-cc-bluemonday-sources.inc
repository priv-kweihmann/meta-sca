SRC_URI += "https://proxy.golang.org/github.com/microcosm-cc/bluemonday/@v/v1.0.5.zip;srcoutput=github.com/microcosm-cc/bluemonday;srcinput=github.com/microcosm-cc/bluemonday@v1.0.5;downloadfilename=github-com-microcosm-cc-bluemonday-1.0.5.zip;name=github-com-microcosm-cc-bluemonday"
SRC_URI[github-com-microcosm-cc-bluemonday.sha256sum] = "654eae4091952cc1e0f1a0c3e16057e924339d08d92ac3dd2636e9daca446436"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/microcosm-cc/bluemonday/LICENSE.md;md5=0d75e28805ddef5b397ee9a7e5282055 \
"

GOSRC_INCLUDEGUARD += "github.com-microcosm-cc-bluemonday-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-chris-ramon-douceur-sources.inc', '', 'github.com-chris-ramon-douceur-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}

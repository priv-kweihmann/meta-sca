SRC_URI += "https://proxy.golang.org/github.com/microcosm-cc/bluemonday/@v/v1.0.16.zip;srcoutput=github.com/microcosm-cc/bluemonday;srcinput=github.com/microcosm-cc/bluemonday@v1.0.16;downloadfilename=github-com-microcosm-cc-bluemonday-1.0.16.zip;name=github-com-microcosm-cc-bluemonday"
SRC_URI[github-com-microcosm-cc-bluemonday.sha256sum] = "639caf99d9c73f9ebc4dcf6288a0e77e64cb1a85d2764d877ffda7059ee3f3e2"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/microcosm-cc/bluemonday/LICENSE.md;md5=0d75e28805ddef5b397ee9a7e5282055 \
"

GOSRC_INCLUDEGUARD += "github.com-microcosm-cc-bluemonday-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-aymerick-douceur-sources.inc', '', 'github.com-aymerick-douceur-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}

SRC_URI += "https://proxy.golang.org/golang.org/x/exp/@v/v0.0.0-20230515195305-f3d0a9c9a5cc.zip;srcoutput=golang.org/x/exp;srcinput=golang.org/x/exp@v0.0.0-20230515195305-f3d0a9c9a5cc;downloadfilename=golang-org-x-exp-0.0.0-20230515195305-f3d0a9c9a5cc.zip;name=golang-org-x-exp"
SRC_URI[golang-org-x-exp.sha256sum] = "cd803034418071b63f7494cf51e13d2ac321bfca4dde33b9bbac7721bd11cd7b"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/exp/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-exp-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}

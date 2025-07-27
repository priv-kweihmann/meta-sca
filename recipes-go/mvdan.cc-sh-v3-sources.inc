SRC_URI += "https://proxy.golang.org/mvdan.cc/sh/v3/@v/v3.12.0.zip;srcoutput=mvdan.cc/sh/v3;srcinput=mvdan.cc/sh/v3@v3.12.0;downloadfilename=mvdan-cc-sh-v3-3.12.0.zip;name=mvdan-cc-sh-v3"
SRC_URI[mvdan-cc-sh-v3.sha256sum] = "e5c1949ada636589ba1d0621274bd6d2e7b46f9def4181cc4fb0e97b7a8779ef"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://mvdan.cc/sh/v3/LICENSE;md5=5762bc15271b0661f5c9c593cd080548 \
"

GOSRC_INCLUDEGUARD += "mvdan.cc-sh-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-renameio-v2-sources.inc', '', 'github.com-google-renameio-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rogpeppe-go-internal-sources.inc', '', 'github.com-rogpeppe-go-internal-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-editorconfig-sources.inc', '', 'mvdan.cc-editorconfig-sources.inc', d)}

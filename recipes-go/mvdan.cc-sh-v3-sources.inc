SRC_URI += "https://proxy.golang.org/mvdan.cc/sh/v3/@v/v3.9.0.zip;srcoutput=mvdan.cc/sh/v3;srcinput=mvdan.cc/sh/v3@v3.9.0;downloadfilename=mvdan-cc-sh-v3-3.9.0.zip;name=mvdan-cc-sh-v3"
SRC_URI[mvdan-cc-sh-v3.sha256sum] = "c5024f5778e8d02906639a0bd98b2214b67908cfb2a1298b7f5be10880b9f461"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://mvdan.cc/sh/v3/LICENSE;md5=5762bc15271b0661f5c9c593cd080548 \
"

GOSRC_INCLUDEGUARD += "mvdan.cc-sh-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-renameio-v2-sources.inc', '', 'github.com-google-renameio-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-muesli-cancelreader-sources.inc', '', 'github.com-muesli-cancelreader-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rogpeppe-go-internal-sources.inc', '', 'github.com-rogpeppe-go-internal-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-editorconfig-sources.inc', '', 'mvdan.cc-editorconfig-sources.inc', d)}

SRC_URI += "https://proxy.golang.org/mvdan.cc/sh/v3/@v/v3.8.0.zip;srcoutput=mvdan.cc/sh/v3;srcinput=mvdan.cc/sh/v3@v3.8.0;downloadfilename=mvdan-cc-sh-v3-3.8.0.zip;name=mvdan-cc-sh-v3"
SRC_URI[mvdan-cc-sh-v3.sha256sum] = "85ff7518d6cc61dd416cc2120ae244b2f46490130aac50c30eb69d8ff9272042"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://mvdan.cc/sh/v3/LICENSE;md5=5762bc15271b0661f5c9c593cd080548 \
"

GOSRC_INCLUDEGUARD += "mvdan.cc-sh-v3-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-renameio-v2-sources.inc', '', 'github.com-google-renameio-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-diff-sources.inc', '', 'github.com-pkg-diff-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-editorconfig-sources.inc', '', 'mvdan.cc-editorconfig-sources.inc', d)}

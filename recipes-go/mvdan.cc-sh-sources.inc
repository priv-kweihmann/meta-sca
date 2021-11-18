SRC_URI += "https://github.com/mvdan/sh/archive/refs/tags/v3.4.0.zip;srcoutput=mvdan.cc/sh;srcinput=sh-3.4.0;downloadfilename=mvdan-cc-sh-3.4.0.zip;name=mvdan-cc-sh"
SRC_URI[mvdan-cc-sh.sha256sum] = "b610c1e636d6767ed07efd348869544cf2d574cdf2ec8babf3b3747b4948d2af"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/mvdan.cc/sh/LICENSE;md5=5762bc15271b0661f5c9c593cd080548 \
    file://src/mvdan.cc/sh/_js/LICENSE;md5=5762bc15271b0661f5c9c593cd080548 \
"

GOSRC_INCLUDEGUARD += "mvdan.cc-sh-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-renameio-sources.inc', '', 'github.com-google-renameio-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-diff-sources.inc', '', 'github.com-pkg-diff-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-term-sources.inc', '', 'golang.org-x-term-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-editorconfig-sources.inc', '', 'mvdan.cc-editorconfig-sources.inc', d)}

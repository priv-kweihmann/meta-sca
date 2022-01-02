SRC_URI += "git://github.com/mvdan/sh;nobranch=1;protocol=https;srcinput=mvdan.cc/sh;srcoutput=mvdan.cc/sh;destsuffix=mvdan.cc/sh;name=mvdan-cc-sh"
SRCREV_mvdan-cc-sh = "340f41a1f08872343140cf9014466142b0305915"

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

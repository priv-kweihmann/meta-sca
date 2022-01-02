SRC_URI += "git://github.com/Masterminds/goutils;nobranch=1;protocol=https;srcinput=github.com/Masterminds/goutils;srcoutput=github.com/Masterminds/goutils;destsuffix=github.com/Masterminds/goutils;name=github-com-masterminds-goutils"
SRCREV_github-com-masterminds-goutils = "f1923532a168b8203bfe956d8cd3b17ebece5982"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/Masterminds/goutils/LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-masterminds-goutils-sources.inc"


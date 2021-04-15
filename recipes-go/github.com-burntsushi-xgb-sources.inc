SRC_URI += "git://github.com/BurntSushi/xgb;nobranch=1;protocol=https;srcinput=github.com/BurntSushi/xgb;srcoutput=github.com/BurntSushi/xgb;destsuffix=github.com/BurntSushi/xgb;name=github-com-burntsushi-xgb"
SRCREV_github-com-burntsushi-xgb = "deaf085860bc2ec870e50cacc83c467b3501a404"
UPSTREAM_CHECK_COMMITS = "1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    WTFPL \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/BurntSushi/xgb/LICENSE;md5=8f2b26c1f75e2d57c4f5c1659bc61619 \
    file://src/github.com/BurntSushi/xgb/xgbgen/COPYING;md5=f312a7c4d02230e8f2b537295d375c69 \
"

GOSRC_INCLUDEGUARD += "github.com-burntsushi-xgb-sources.inc"


SRC_URI += "https://proxy.golang.org/github.com/lufia/plan9stats/@v/v0.0.0-20220326011226-f1430873d8db.zip;srcoutput=github.com/lufia/plan9stats;srcinput=github.com/lufia/plan9stats@v0.0.0-20220326011226-f1430873d8db;downloadfilename=github-com-lufia-plan9stats-0.0.0-20220326011226-f1430873d8db.zip;name=github-com-lufia-plan9stats"
SRC_URI[github-com-lufia-plan9stats.sha256sum] = "060137725c3da4febfabc2038b8278aa9aa5cb9523178e84fde17500f2bf0d0c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/lufia/plan9stats/LICENSE;md5=3d06b580c89c919790d71cd15a0d49e6 \
"

GOSRC_INCLUDEGUARD += "github.com-lufia-plan9stats-sources.inc"


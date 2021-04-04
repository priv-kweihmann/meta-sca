SRC_URI += "https://proxy.golang.org/github.com/mcandre/stank/@v/v0.0.19.zip;srcoutput=github.com/mcandre/stank;srcinput=github.com/mcandre/stank@v0.0.19;downloadfilename=github-com-mcandre-stank-0.0.19.zip;name=github-com-mcandre-stank"
SRC_URI[github-com-mcandre-stank.sha256sum] = "dcfd2160fd4faf42f0d5413d49426c96e3bbdf4963233e913c0813fa6fe0e614"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mcandre/stank/LICENSE.md;md5=6a55da1ae5d911566ba1a841e39c5a42 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-stank-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-sh-sources.inc', '', 'mvdan.cc-sh-sources.inc', d)}

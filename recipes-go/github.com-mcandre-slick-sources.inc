SRC_URI += "https://proxy.golang.org/github.com/mcandre/slick/@v/v0.0.3.zip;srcoutput=github.com/mcandre/slick;srcinput=github.com/mcandre/slick@v0.0.3;downloadfilename=github-com-mcandre-slick-0.0.3.zip;name=github-com-mcandre-slick"
SRC_URI[github-com-mcandre-slick.sha256sum] = "617b3ed78e6b00ed8ad3f6a4db9ae0c6d30d6f0646fa38e1f5312b7ceaa8634a"

GOSRC_LICENSE += "\
    BSD-2-Clause-Views \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mcandre/slick/LICENSE.md;md5=6a55da1ae5d911566ba1a841e39c5a42 \
"

GOSRC_INCLUDEGUARD += "github.com-mcandre-slick-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'mvdan.cc-sh-sources.inc', '', 'mvdan.cc-sh-sources.inc', d)}

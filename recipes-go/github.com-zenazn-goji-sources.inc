SRC_URI += "https://proxy.golang.org/github.com/zenazn/goji/@v/v1.0.1.zip;srcoutput=github.com/zenazn/goji;srcinput=github.com/zenazn/goji@v1.0.1;downloadfilename=github-com-zenazn-goji-1.0.1.zip;name=github-com-zenazn-goji"
SRC_URI[github-com-zenazn-goji.sha256sum] = "f97948b175d783a00a2b0421a0807bee58a1a8a0bfa454af054b6096bcd3bae6"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/zenazn/goji/LICENSE;md5=976eee5cbc46a62e179b59f362e3af60 \
"

GOSRC_INCLUDEGUARD += "github.com-zenazn-goji-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-goji-param-sources.inc', '', 'github.com-goji-param-sources.inc', d)}

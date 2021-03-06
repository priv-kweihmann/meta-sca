SRC_URI += "https://proxy.golang.org/github.com/modern-go/reflect2/@v/v1.0.1.zip;srcoutput=github.com/modern-go/reflect2;srcinput=github.com/modern-go/reflect2@v1.0.1;downloadfilename=github-com-modern-go-reflect2-1.0.1.zip;name=github-com-modern-go-reflect2"
SRC_URI[github-com-modern-go-reflect2.sha256sum] = "6af8268206d037428a4197bd421bbe5399c19450ef53ae8309a083f34fb7ac05"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/modern-go/reflect2/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-modern-go-reflect2-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-modern-go-concurrent-sources.inc', '', 'github.com-modern-go-concurrent-sources.inc', d)}

SRC_URI += "https://proxy.golang.org/github.com/modern-go/reflect2/@v/v1.0.2.zip;srcoutput=github.com/modern-go/reflect2;srcinput=github.com/modern-go/reflect2@v1.0.2;downloadfilename=github-com-modern-go-reflect2-1.0.2.zip;name=github-com-modern-go-reflect2"
SRC_URI[github-com-modern-go-reflect2.sha256sum] = "f46f41409c2e74293f82cfe6c70b5d582bff8ada0106a7d3ff5706520c50c21c"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/modern-go/reflect2/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

GOSRC_INCLUDEGUARD += "github.com-modern-go-reflect2-sources.inc"


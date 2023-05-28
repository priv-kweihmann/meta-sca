SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/v2/@v/v2.0.8.zip;srcoutput=github.com/pelletier/go-toml/v2;srcinput=github.com/pelletier/go-toml/v2@v2.0.8;downloadfilename=github-com-pelletier-go-toml-v2-2.0.8.zip;name=github-com-pelletier-go-toml-v2"
SRC_URI[github-com-pelletier-go-toml-v2.sha256sum] = "9b1cdae5cf044712d015c82502e5c362a4758c2e686b8d8398f6edbb768a2aa1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/v2/LICENSE;md5=f8ae6fc968bb3e3c295f709e57519c76 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-v2-sources.inc"


SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/v2/@v/v2.0.3.zip;srcoutput=github.com/pelletier/go-toml/v2;srcinput=github.com/pelletier/go-toml/v2@v2.0.3;downloadfilename=github-com-pelletier-go-toml-v2-2.0.3.zip;name=github-com-pelletier-go-toml-v2"
SRC_URI[github-com-pelletier-go-toml-v2.sha256sum] = "4734fdfe0d14e267d631394f7afba1d2d6499479b48c53e972e38765e5772613"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/v2/LICENSE;md5=f8ae6fc968bb3e3c295f709e57519c76 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-v2-sources.inc"


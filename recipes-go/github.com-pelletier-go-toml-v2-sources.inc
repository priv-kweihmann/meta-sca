SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/v2/@v/v2.0.6.zip;srcoutput=github.com/pelletier/go-toml/v2;srcinput=github.com/pelletier/go-toml/v2@v2.0.6;downloadfilename=github-com-pelletier-go-toml-v2-2.0.6.zip;name=github-com-pelletier-go-toml-v2"
SRC_URI[github-com-pelletier-go-toml-v2.sha256sum] = "019e4a01739e7ca3701d5f7b4af5717ac5eb4d6d4921b88425d7f40cadb1bd7d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/v2/LICENSE;md5=f8ae6fc968bb3e3c295f709e57519c76 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-v2-sources.inc"


SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/v2/@v/v2.0.5.zip;srcoutput=github.com/pelletier/go-toml/v2;srcinput=github.com/pelletier/go-toml/v2@v2.0.5;downloadfilename=github-com-pelletier-go-toml-v2-2.0.5.zip;name=github-com-pelletier-go-toml-v2"
SRC_URI[github-com-pelletier-go-toml-v2.sha256sum] = "f7550c7c319b1e80f47d23f191a8d1024063ad3c3879d77e5f225aa7b2140bfd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/v2/LICENSE;md5=f8ae6fc968bb3e3c295f709e57519c76 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-v2-sources.inc"


SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/@v/v1.9.5.zip;srcoutput=github.com/pelletier/go-toml;srcinput=github.com/pelletier/go-toml@v1.9.5;downloadfilename=github-com-pelletier-go-toml-1.9.5.zip;name=github-com-pelletier-go-toml"
SRC_URI[github-com-pelletier-go-toml.sha256sum] = "de3dcda660cc800cd86d03273a25956d67f416e8fcbe4d2001a2cb4a01e6ac60"

GOSRC_LICENSE += "\
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/LICENSE;md5=e49b63d868761700c5df76e7946d0bd7 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-sources.inc"


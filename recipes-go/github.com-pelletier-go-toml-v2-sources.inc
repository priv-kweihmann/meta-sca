SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/v2/@v/v2.0.7.zip;srcoutput=github.com/pelletier/go-toml/v2;srcinput=github.com/pelletier/go-toml/v2@v2.0.7;downloadfilename=github-com-pelletier-go-toml-v2-2.0.7.zip;name=github-com-pelletier-go-toml-v2"
SRC_URI[github-com-pelletier-go-toml-v2.sha256sum] = "96a823210c59249e99c57d085705580b69963636abd15bc4fe36293639eb1cc9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/v2/LICENSE;md5=f8ae6fc968bb3e3c295f709e57519c76 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-v2-sources.inc"


SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/@v/v1.9.1.zip;srcoutput=github.com/pelletier/go-toml;srcinput=github.com/pelletier/go-toml@v1.9.1;downloadfilename=github-com-pelletier-go-toml-1.9.1.zip;name=github-com-pelletier-go-toml"
SRC_URI[github-com-pelletier-go-toml.sha256sum] = "b69d0451b51bfd8dca287886a94015c27923192aa1a525d871aad19ee7cc0f5c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/LICENSE;md5=ea31483c6641bffeaaf0c453a6212388 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-sources.inc"


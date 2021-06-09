SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/@v/v1.9.2.zip;srcoutput=github.com/pelletier/go-toml;srcinput=github.com/pelletier/go-toml@v1.9.2;downloadfilename=github-com-pelletier-go-toml-1.9.2.zip;name=github-com-pelletier-go-toml"
SRC_URI[github-com-pelletier-go-toml.sha256sum] = "41b802cfc93ebed8248b13c49632e7118e8bd46319bf493f98e9d17f1293fba1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/LICENSE;md5=ea31483c6641bffeaaf0c453a6212388 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-sources.inc"


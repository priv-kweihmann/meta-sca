SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/@v/v1.9.0.zip;srcoutput=github.com/pelletier/go-toml;srcinput=github.com/pelletier/go-toml@v1.9.0;downloadfilename=github-com-pelletier-go-toml-1.9.0.zip;name=github-com-pelletier-go-toml"
SRC_URI[github-com-pelletier-go-toml.sha256sum] = "f687d928c8666cd7c05920075a52735e25a632184f2b5f863321c4c41ff1e404"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/LICENSE;md5=ea31483c6641bffeaaf0c453a6212388 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-sources.inc"


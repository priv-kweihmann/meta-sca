SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/@v/v1.8.1.zip;srcoutput=github.com/pelletier/go-toml;srcinput=github.com/pelletier/go-toml@v1.8.1;downloadfilename=github-com-pelletier-go-toml-1.8.1.zip;name=github-com-pelletier-go-toml"
SRC_URI[github-com-pelletier-go-toml.sha256sum] = "ae7f5dce703e10956c80bfabee02fbd6d0acc3d5f0954c96bd29c8c4f0cfa097"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/LICENSE;md5=dc9ea87a81f62b8871b2a4158edbfde6 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-sources.inc"


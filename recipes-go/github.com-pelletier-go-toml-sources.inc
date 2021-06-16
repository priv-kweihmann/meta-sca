SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/@v/v1.9.3.zip;srcoutput=github.com/pelletier/go-toml;srcinput=github.com/pelletier/go-toml@v1.9.3;downloadfilename=github-com-pelletier-go-toml-1.9.3.zip;name=github-com-pelletier-go-toml"
SRC_URI[github-com-pelletier-go-toml.sha256sum] = "a52f4a0d5d8f6e98bbfc493ec947e1be44b8f304005d2059ecc4c5938b712961"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/LICENSE;md5=e49b63d868761700c5df76e7946d0bd7 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-sources.inc"


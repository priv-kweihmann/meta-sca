SRC_URI += "https://proxy.golang.org/github.com/pelletier/go-toml/@v/v1.9.4.zip;srcoutput=github.com/pelletier/go-toml;srcinput=github.com/pelletier/go-toml@v1.9.4;downloadfilename=github-com-pelletier-go-toml-1.9.4.zip;name=github-com-pelletier-go-toml"
SRC_URI[github-com-pelletier-go-toml.sha256sum] = "2d4b517fbeb17c6dec8d0477d92f63e689d6d49c6631b848eaf9a6380047a51c"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/pelletier/go-toml/LICENSE;md5=e49b63d868761700c5df76e7946d0bd7 \
"

GOSRC_INCLUDEGUARD += "github.com-pelletier-go-toml-sources.inc"


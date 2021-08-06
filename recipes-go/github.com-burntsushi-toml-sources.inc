SRC_URI += "https://github.com/BurntSushi/toml/archive/refs/tags/v0.4.1.zip;srcoutput=github.com/BurntSushi/toml;srcinput=toml-0.4.1;downloadfilename=github-com-burntsushi-toml-0.4.1.zip;name=github-com-burntsushi-toml"
SRC_URI[github-com-burntsushi-toml.sha256sum] = "9829a7c0dba215e96e01adf4c4eff18cebb5816e89881e0406eb5230db2fdc4e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/BurntSushi/toml/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
    file://src/github.com/BurntSushi/toml/cmd/toml-test-decoder/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
    file://src/github.com/BurntSushi/toml/cmd/toml-test-encoder/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
    file://src/github.com/BurntSushi/toml/cmd/tomlv/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
    file://src/github.com/BurntSushi/toml/internal/toml-test/COPYING;md5=2cd67fca932d1b1ef026fbc3d89d9b57 \
"

GOSRC_INCLUDEGUARD += "github.com-burntsushi-toml-sources.inc"


SRC_URI += "git://github.com/BurntSushi/toml;nobranch=1;protocol=https;srcinput=github.com/BurntSushi/toml;srcoutput=github.com/BurntSushi/toml;destsuffix=github.com/BurntSushi/toml;name=github-com-burntsushi-toml"
SRCREV_github-com-burntsushi-toml = "641c3cf2148ad11ca058c000eab0453dd5d67954"

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


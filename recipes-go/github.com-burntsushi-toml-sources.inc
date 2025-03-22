SRC_URI += "git://github.com/BurntSushi/toml;nobranch=1;protocol=https;srcinput=github.com/BurntSushi/toml;srcoutput=github.com/BurntSushi/toml;destsuffix=github.com/BurntSushi/toml;name=github-com-burntsushi-toml"
SRCREV_github-com-burntsushi-toml = "d97def528e83313822a9f98946334ffccd542bdf"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/BurntSushi/toml/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
    file://github.com/BurntSushi/toml/cmd/toml-test-decoder/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
    file://github.com/BurntSushi/toml/cmd/toml-test-encoder/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
    file://github.com/BurntSushi/toml/cmd/tomlv/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
"

GOSRC_INCLUDEGUARD += "github.com-burntsushi-toml-sources.inc"


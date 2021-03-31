SRC_URI_append = " https://github.com/BurntSushi/toml/archive/refs/tags/v0.3.1.zip;srcoutput=github.com/BurntSushi/toml;srcinput=toml-0.3.1;downloadfilename=github-com-burntsushi-toml-0.3.1.zip;name=github-com-burntsushi-toml"
SRC_URI[github-com-burntsushi-toml.sha256sum] = "bf028c2efb232e5d9b3e687f78408693e80cf5fb4ce8d9a1e68c7b92b4bee4f4"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/BurntSushi/toml/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
    file://src/github.com/BurntSushi/toml/cmd/toml-test-decoder/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
    file://src/github.com/BurntSushi/toml/cmd/toml-test-encoder/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
    file://src/github.com/BurntSushi/toml/cmd/tomlv/COPYING;md5=9e24c0e2a784c1d1fcabb279f4f107e0 \
"

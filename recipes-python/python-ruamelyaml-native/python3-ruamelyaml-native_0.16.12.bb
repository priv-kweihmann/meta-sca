SUMMARY = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60afc0a1bb0501c0c555cabe78bba022"

DEPENDS += "python3-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml"

SRC_URI[md5sum] = "c7e4b216d9554d80be42011b448b7c61"
SRC_URI[sha256sum] = "076cc0bc34f1966d920a49f18b52b6ad559fbe656a0748e3535cf7b3f29ebf9e"

inherit pypi
inherit setuptools3
inherit native

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

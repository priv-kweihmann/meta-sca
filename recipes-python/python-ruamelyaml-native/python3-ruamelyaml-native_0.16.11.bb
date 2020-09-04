SUMMARY = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60afc0a1bb0501c0c555cabe78bba022"

DEPENDS += "${PYTHON_PN}-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml"

SRC_URI[md5sum] = "020a0140d06b2e32f53944d4335f9877"
SRC_URI[sha256sum] = "43bf19037937f78845775d84582dd6f3ac966bc1b7748de898fad35638c74771"

inherit pypi
inherit native
inherit setuptools3

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

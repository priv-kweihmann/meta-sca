SUMMARY = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
HOMEPAGE = "https://bitbucket.org/ruamel/yaml/src/default/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60afc0a1bb0501c0c555cabe78bba022"

PYPI_PACKAGE = "ruamel.yaml"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-cryptography-native"

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "6a0b7fe48578cf8e4a77d788ac4fe58b"
SRC_URI[sha256sum] = "966e5a049eebf011c90424b9ec7dab6358cee8de0907354b27a27f20a8c4c2ec"

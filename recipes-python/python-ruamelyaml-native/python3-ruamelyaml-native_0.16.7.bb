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

SRC_URI[md5sum] = "67fead37377ebfc9585d3e17dc0af586"
SRC_URI[sha256sum] = "9d59fa89985c55155d35c886663e357813404ae8f94638cb673135b8c8c1a7c7"

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

SRC_URI[md5sum] = "26d268d44e49d624b05053442a490352"
SRC_URI[sha256sum] = "ee3264b83c3309b4ae7978afa185da6a1d278e3abc9fb942f1a0b57c622092f8"

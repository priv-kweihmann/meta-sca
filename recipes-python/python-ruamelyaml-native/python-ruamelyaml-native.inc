SUMMARY = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
HOMEPAGE = "https://bitbucket.org/ruamel/yaml/src/default/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=caf8bd842440b537c044e131785a4666"

PYPI_PACKAGE = "ruamel.yaml"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-ruamelordereddict-native \
            ${PYTHON_PN}-cryptography-native"

inherit pypi

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

inherit native

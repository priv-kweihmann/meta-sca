SUMMARY = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa0a51dfb461e2f803969e0f3fa71dfe"

DEPENDS += "python3-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml"

SRC_URI[md5sum] = "d6cd0bcabdabfbdb0f639374e6e239e3"
SRC_URI[sha256sum] = "374373b4743aee9f6d9f40bea600fe020a7ac7ae36b838b4a6a93f72b584a14c"

inherit pypi
inherit setuptools3
inherit native

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

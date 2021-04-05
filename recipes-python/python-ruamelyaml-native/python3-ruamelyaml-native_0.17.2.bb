SUMMARY = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa0a51dfb461e2f803969e0f3fa71dfe"

DEPENDS += "python3-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml"

SRC_URI[md5sum] = "f3da434bce52befc0aac8f1a7993a138"
SRC_URI[sha256sum] = "8f1e15421668b9edf30ed02899f5f81aff9808a4271935776f61a99a569a13da"

inherit pypi
inherit setuptools3
inherit native

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

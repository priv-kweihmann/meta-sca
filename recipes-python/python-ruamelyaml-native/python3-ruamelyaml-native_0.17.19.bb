SUMMARY = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa0a51dfb461e2f803969e0f3fa71dfe"

DEPENDS += "python3-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml"

SRC_URI[md5sum] = "ae65ff00a2200703bb125a9e43c2d6e0"
SRC_URI[sha256sum] = "b9ce9a925d0f0c35a1dbba56b40f253c53cd526b0fa81cf7b1d24996f28fb1d7"

inherit pypi
inherit setuptools3
inherit native

do_install:prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

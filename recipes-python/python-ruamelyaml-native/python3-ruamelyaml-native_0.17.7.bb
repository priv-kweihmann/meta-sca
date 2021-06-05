SUMMARY = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa0a51dfb461e2f803969e0f3fa71dfe"

DEPENDS += "python3-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml"

SRC_URI[md5sum] = "d4025b2714fe84c5bdae430eb04d5973"
SRC_URI[sha256sum] = "5c3fa739bbedd2f23769656784e671c6335d17a5bf163c3c3901d8663c0af287"

inherit pypi
inherit setuptools3
inherit native

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

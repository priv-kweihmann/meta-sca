SUMMARY = "C version of reader, parser and emitter for ruamel.yaml derived from libyaml"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml-clib/code/ci/default/tree"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c9dbf2e8465c3975484d69f30c72a8f"

DEPENDS += "python3-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml.clib"

SRC_URI[md5sum] = "e2397bedcd1f40b2f22b3696175082aa"
SRC_URI[sha256sum] = "4ff604ce439abb20794f05613c374759ce10e3595d1867764dd1ae675b85acbd"

inherit pypi
inherit setuptools3
inherit native

do_install:prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

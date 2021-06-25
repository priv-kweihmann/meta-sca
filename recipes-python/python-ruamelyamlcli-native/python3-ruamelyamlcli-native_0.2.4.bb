SUMMARY = "C version of reader, parser and emitter for ruamel.yaml derived from libyaml"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml-clib/code/ci/default/tree"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6c9dbf2e8465c3975484d69f30c72a8f"

DEPENDS += "python3-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml.clib"

SRC_URI[md5sum] = "5cb7a44c789f37dba247d29381151799"
SRC_URI[sha256sum] = "f997f13fd94e37e8b7d7dbe759088bb428adc6570da06b64a913d932d891ac8d"

inherit pypi
inherit setuptools3
inherit native

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

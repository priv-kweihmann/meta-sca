SUMMARY = "C version of reader, parser and emitter for ruamel.yaml derived from libyaml"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml-clib/code/ci/default/tree"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5180638aadb3eb7fcdc91785973e4170"

DEPENDS += "python3-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml.clib"

SRC_URI[md5sum] = "9995832267e5b900692490f273285bdb"
SRC_URI[sha256sum] = "2d24bd98af676f4990c4d715bcdc2a60b19c56a3fb3a763164d2d8ca0e806ba7"

inherit pypi
inherit setuptools3
inherit native

do_install_prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

SUMMARY = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=034154b7344d15438bc5ed5ee9cc075f"

DEPENDS += "python3-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml"

SRC_URI[md5sum] = "206bda0f33ab2c2f63777636200748b7"
SRC_URI[sha256sum] = "8b7ce697a2f212752a35c1ac414471dc16c424c9573be4926b56ff3f5d23b7af"

inherit pypi
inherit setuptools3
inherit native

do_install:prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

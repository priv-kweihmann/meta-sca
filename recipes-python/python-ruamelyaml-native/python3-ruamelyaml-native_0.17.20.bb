SUMMARY = "ruamel.yaml is a YAML parser/emitter that support comment preservation"
HOMEPAGE = "https://sourceforge.net/p/ruamel-yaml/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=034154b7344d15438bc5ed5ee9cc075f"

DEPENDS += "python3-cryptography-native"

PYPI_PACKAGE = "ruamel.yaml"

SRC_URI[md5sum] = "aa87b795ef8bcbe2f1b2c7572880c745"
SRC_URI[sha256sum] = "4b8a33c1efb2b443a93fcaafcfa4d2e445f8e8c29c528d9f5cdafb7cc9e4004c"

inherit pypi
inherit setuptools3
inherit native

do_install:prepend() {
    export RUAMEL_NO_PIP_INSTALL_CHECK=1
}

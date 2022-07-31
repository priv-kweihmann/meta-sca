SUMMARY = "A pep8 equivalent for bash scripts"
HOMEPAGE = "http://docs.openstack.org/developer/bashate/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += "\
    nativesdk-python3 \
    nativesdk-python3-babel \
    python3-pbr-native \
"

SRC_URI[md5sum] = "e910cde1c80a2518eec647a6110bae2e"
SRC_URI[sha256sum] = "a0df143639715dc2fb6cf9aa6907e4a372d6f0a43afeffc55c5fb3ecfe3523c8"

PYPI_PACKAGE = "bashate"

inherit pypi

inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "bashate"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-babel \
    nativesdk-python3-core \
    nativesdk-python3-misc \
    nativesdk-python3-pbr \
    nativesdk-python3-shell \
    nativesdk-python3-tests \
    nativesdk-python3-unittest \
"

SUMMARY = "Bandit is a tool designed to find common security issues in Python code"
HOMEPAGE = "https://github.com/PyCQA/bandit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += "\
    nativesdk-python3 \
    nativesdk-python3-gitpython \
    nativesdk-python3-pyyaml \
    nativesdk-python3-rich \
    nativesdk-python3-six \
    nativesdk-python3-stevedore \
    python3-pbr-native \
"

SRC_URI[sha256sum] = "b5bfe55a095abd9fe20099178a7c6c060f844bfd4fe4c76d28e35e4c52b9d31e"

PYPI_PACKAGE = "bandit"

inherit pypi

inherit sca-description
inherit setuptools3
inherit_defer nativesdk
SCA_TOOL_DESCRIPTION = "bandit"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-gitpython \
    nativesdk-python3-io \
    nativesdk-python3-logging \
    nativesdk-python3-pbr \
    nativesdk-python3-pyyaml \
    nativesdk-python3-rich \
    nativesdk-python3-six \
    nativesdk-python3-stevedore \
"

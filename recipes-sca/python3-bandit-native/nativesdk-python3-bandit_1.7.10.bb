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

SRC_URI[sha256sum] = "59ed5caf5d92b6ada4bf65bc6437feea4a9da1093384445fed4d472acc6cff7b"

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

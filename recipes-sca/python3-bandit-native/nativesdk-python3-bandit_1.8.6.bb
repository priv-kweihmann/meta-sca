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

SRC_URI:append = " file://pyproject.toml"
SRC_URI[sha256sum] = "dbfe9c25fc6961c2078593de55fd19f2559f9e45b99f1272341f5b95dea4e56b"

PYPI_PACKAGE = "bandit"

inherit pypi
inherit sca-description
inherit python_setuptools_build_meta
inherit_defer nativesdk

do_configure:prepend() {
    cp ${UNPACKDIR}/pyproject.toml ${S}
}

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

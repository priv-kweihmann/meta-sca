SUMMARY = "Bandit is a tool designed to find common security issues in Python code"
HOMEPAGE = "https://github.com/PyCQA/bandit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += "\
            python3-gitpython-native \
            python3-native \
            python3-pbr-native \
            python3-pyyaml-native \
            python3-rich-native \
            python3-six-native \
            python3-stevedore-native \
           "

SRC_URI:append = " file://pyproject.toml"
SRC_URI[sha256sum] = "32410415cd93bf9c8b91972159d5cf1e7f063a9146d70345641cd3877de348ce"

PYPI_PACKAGE = "bandit"

inherit pypi
inherit sca-description
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    cp ${UNPACKDIR}/pyproject.toml ${S}
    rm -rf ${S}/logo
    rm -rf ${S}/docker
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

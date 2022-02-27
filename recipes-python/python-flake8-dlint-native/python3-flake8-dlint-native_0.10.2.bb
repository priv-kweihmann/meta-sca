SUMMARY = "encouraging best coding practices for python code"
DESCRIPTION = "Dlint is a tool for encouraging best coding practices and helping ensure we're writing secure Python code"
HOMEPAGE = "https://github.com/duo-labs/dlint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe4ea50135cd6b033f509f16a8d2b96b"

DEPENDS += "python3-flake8-native"

SRC_URI = "git://github.com/duo-labs/dlint.git;branch=master;protocol=https"
SRCREV = "b6029c48345e0d2383fdf01dc4ffb9ac417980f9"

S = "${WORKDIR}/git"
PIP_INSTALL_PACKAGE = "dlint"

inherit setuptools3
inherit native

do_install:append() {
    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}

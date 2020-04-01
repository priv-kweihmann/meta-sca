SUMMARY = "encouraging best coding practices for python code"
DESCRIPTION = "Dlint is a tool for encouraging best coding practices and helping ensure we're writing secure Python code"
HOMEPAGE = "https://github.com/duo-labs/dlint"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe4ea50135cd6b033f509f16a8d2b96b"

DEPENDS += "${PYTHON_PN}-flake8-native"

SRC_URI = "git://github.com/duo-labs/dlint.git;protocol=https;tag=${PV}"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3

do_install_append() {
    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}

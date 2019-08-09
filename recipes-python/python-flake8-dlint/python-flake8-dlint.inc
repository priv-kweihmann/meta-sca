SUMMARY = "Dlint is a tool for encouraging best coding practices and helping ensure we're writing secure Python code"

HOMEPAGE = "https://github.com/duo-labs/dlint"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe4ea50135cd6b033f509f16a8d2b96b"

SRC_URI = "git://github.com/duo-labs/dlint.git;protcol=https;tag=${PV}"

S = "${WORKDIR}/git"

DEPENDS += " \
            ${PYTHON_PN}-flake8-native \
            "

inherit native

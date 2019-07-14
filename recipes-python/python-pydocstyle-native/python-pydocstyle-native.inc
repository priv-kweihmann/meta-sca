SUMMARY = "docstring style checker"
DESCRIPTION = "docstring style checker"
HOMEPAGE = "https://github.com/PyCQA/pydocstyle/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=6a43617fba5e0cbfca6820bd2b8d16b9"

PYPI_PACKAGE = "pydocstyle"

SRC_URI = "git://github.com/PyCQA/pydocstyle.git;protocol=https;tag=${PV}"

S = "${WORKDIR}/git"

DEPENDS += "\
            ${PYTHON_PN}-snowballstemmer-native \
            "

inherit native

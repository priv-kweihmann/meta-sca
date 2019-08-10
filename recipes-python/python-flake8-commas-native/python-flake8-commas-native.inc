SUMMARY = "Flake8 lint for trailing commas."

HOMEPAGE = "https://github.com/PyCQA/flake8-commas/"

SRC_URI = "git://github.com/PyCQA/flake8-commas.git;protocol=https;tag=${PV}"
S = "${WORKDIR}/git"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c816149279ec41ec9d1cba44cbd47b03"

PYPI_PACKAGE = "flake8-commas"

DEPENDS += " \
            ${PYTHON_PN}-flake8-native \
            "

inherit native

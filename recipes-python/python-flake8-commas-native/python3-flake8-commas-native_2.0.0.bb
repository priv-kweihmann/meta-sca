SUMMARY = "Flake8 lint for trailing commas"
HOMEPAGE = "https://github.com/PyCQA/flake8-commas/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c816149279ec41ec9d1cba44cbd47b03"

DEPENDS += "${PYTHON_PN}-flake8-native"

SRC_URI = "git://github.com/PyCQA/flake8-commas.git;protocol=https;tag=${PV}"
S = "${WORKDIR}/git"

inherit native
inherit setuptools3

SUMMARY = "docstring style checker"
HOMEPAGE = "https://github.com/PyCQA/pydocstyle/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=e759cd67def347876897f64931fd6065"

DEPENDS += "nativesdk-python3-snowballstemmer"

SRC_URI = "git://github.com/PyCQA/pydocstyle.git;branch=master;protocol=https"
SRCREV = "07f6707e2c5612960347f7c00125620457f490a7"

S = "${WORKDIR}/git"

PIP_INSTALL_PACKAGE = "pydocstyle"

inherit python_poetry_core
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-snowballstemmer"

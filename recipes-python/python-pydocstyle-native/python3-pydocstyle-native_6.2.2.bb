SUMMARY = "docstring style checker"
HOMEPAGE = "https://github.com/PyCQA/pydocstyle/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=e759cd67def347876897f64931fd6065"

DEPENDS += "python3-snowballstemmer-native"

SRC_URI = "git://github.com/PyCQA/pydocstyle.git;branch=master;protocol=https"
SRCREV = "bd294bbf6c80c578716e8817b5de79220ac9f089"

S = "${WORKDIR}/git"

PIP_INSTALL_PACKAGE = "pydocstyle"

inherit python_poetry_core
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-snowballstemmer"

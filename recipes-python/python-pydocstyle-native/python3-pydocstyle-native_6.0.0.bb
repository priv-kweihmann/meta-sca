SUMMARY = "docstring style checker"
HOMEPAGE = "https://github.com/PyCQA/pydocstyle/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=e759cd67def347876897f64931fd6065"

DEPENDS += "python3-snowballstemmer-native"

SRC_URI = "git://github.com/PyCQA/pydocstyle.git;protocol=https"
SRCREV = "5f59f6eba0d8f0168c6ab45ee97485569b861b77"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

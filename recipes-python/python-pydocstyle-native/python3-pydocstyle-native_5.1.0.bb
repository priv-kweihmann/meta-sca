SUMMARY = "docstring style checker"
HOMEPAGE = "https://github.com/PyCQA/pydocstyle/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=6a43617fba5e0cbfca6820bd2b8d16b9"

DEPENDS += "${PYTHON_PN}-snowballstemmer-native"

SRC_URI = "git://github.com/PyCQA/pydocstyle.git;protocol=https"
SRCREV = "d30ceea7b834b7d18cdac56af98c04e9923e68c2"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3

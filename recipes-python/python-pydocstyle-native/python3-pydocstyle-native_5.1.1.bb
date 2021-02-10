SUMMARY = "docstring style checker"
HOMEPAGE = "https://github.com/PyCQA/pydocstyle/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=6a43617fba5e0cbfca6820bd2b8d16b9"

DEPENDS += "python3-snowballstemmer-native"

SRC_URI = "git://github.com/PyCQA/pydocstyle.git;protocol=https"
SRCREV = "3324459514ddb048fc919ab2ed1f52471b801ab0"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

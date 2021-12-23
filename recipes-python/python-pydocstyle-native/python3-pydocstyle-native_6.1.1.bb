SUMMARY = "docstring style checker"
HOMEPAGE = "https://github.com/PyCQA/pydocstyle/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=e759cd67def347876897f64931fd6065"

DEPENDS += "python3-snowballstemmer-native"

SRC_URI = "git://github.com/PyCQA/pydocstyle.git;branch=master;protocol=https"
SRCREV = "faeaa735d5c9387ab2f02c5bf9d4f07d0e7b6841"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

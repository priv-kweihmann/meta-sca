SUMMARY = "Package requirements checker, plugin for flake8"
HOMEPAGE = "https://github.com/ebeweber/flake8-mutable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f6a7ebcbe234d94509bad74d466632ee"

DEPENDS += "\
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-toml-native \
            "

SRC_URI = "git://github.com/Arkq/flake8-requirements.git;protocol=https"
SRCREV = "d38fc92ddcb84d26e0d94da5366894b4500b864b"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3

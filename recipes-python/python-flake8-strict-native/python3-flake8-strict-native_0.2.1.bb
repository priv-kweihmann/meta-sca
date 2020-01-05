SUMMARY = "Flake8 plugin that checks Python code against a set of opinionated style rules"
DESCRIPTION = "Flake8 plugin that checks Python code against a set of opinionated style rules"
HOMEPAGE = "https://github.com/smarkets/flake8-strict"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6ceb86d5d9e2cc99e949bd8ec58dba3"

SRC_URI = "git://github.com/smarkets/flake8-strict.git;protocol=https"
SRCREV = "7c40ad30ecb6d8a31ac384ed49bb8107cfd5023e"

S = "${WORKDIR}/git"

DEPENDS += " \
            ${PYTHON_PN}-black-native \
            ${PYTHON_PN}-enum-compat-native \
            ${PYTHON_PN}-flake8-native \
            "

inherit native
inherit setuptools3

SRC_URI[md5sum] = "ad84b9969cb73f89d44ed0d7110797a1"
SRC_URI[sha256sum] = "75d5c11babe3f3b2bc5349e645112571a1d80d6183bda99afe5ffdfc70192d10"

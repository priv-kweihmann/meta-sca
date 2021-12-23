SUMMARY = "A flake8 extension that helps to make more readable variables names"
HOMEPAGE = "https://github.com/best-doctor/flake8-variables-names"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=352fd8fef192c98968c70971a80f959c"

DEPENDS += "python3-flake8-native"

SRC_URI = "git://github.com/best-doctor/flake8-variables-names.git;branch=master;protocol=https"
SRCREV = "746fa90de6843e20161171f9d056bf45bd67be63"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

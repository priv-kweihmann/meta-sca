SUMMARY = "A flake8 extension that helps to make more readable variables names"
HOMEPAGE = "https://github.com/best-doctor/flake8-variables-names"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=352fd8fef192c98968c70971a80f959c"

DEPENDS += "nativesdk-python3-flake8"

SRC_URI = "git://github.com/best-doctor/flake8-variables-names.git;branch=master;protocol=https"
SRCREV = "3db7cd93a8f4e80cd856d7e713acc4f656644219"

S = "${WORKDIR}/git"
PIP_INSTALL_PACKAGE = "flake8_variables_names"

inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"

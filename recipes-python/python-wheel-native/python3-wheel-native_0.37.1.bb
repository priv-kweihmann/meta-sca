SUMMARY = "The official binary distribution format for Python"
HOMEPAGE = "https://github.com/pypa/wheel"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE.txt;md5=9d66b41bc2a080e7174acc5dffecd752"

SRC_URI:append = "  https://raw.githubusercontent.com/pypa/wheel/${PV}/LICENSE.txt;name=license"
SRC_URI[license.sha256sum] = "cca9e20c6af1fcfbf69408f377769286cbeebcded336100c9b4a3f35fbe635e4"

PYPI_PACKAGE = "wheel"

SRC_URI[md5sum] = "f490f1399e5903706cb1d4fbed9ecb28"
SRC_URI[sha256sum] = "e9a504e793efbca1b8e0e9cb979a249cf4a0a7b5b8c9e8b65a5e39d49529c1c4"

inherit pypi
inherit setuptools3
inherit native

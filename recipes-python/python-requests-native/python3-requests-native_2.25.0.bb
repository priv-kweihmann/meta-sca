SUMMARY = "Python HTTP Requests for Humans"
HOMEPAGE = "https://github.com/psf/requests"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += "\
            ${PYTHON_PN}-certifi-native \
            ${PYTHON_PN}-chardet-native \
            ${PYTHON_PN}-idna-native \
            ${PYTHON_PN}-urllib3-native \
           "

PYPI_PACKAGE = "requests"

SRC_URI[md5sum] = "94cd712029077897e252212c5f402b79"
SRC_URI[sha256sum] = "7f1a0b932f4a60a1a65caa4263921bb7d9ee911957e0ae4a23a6dd08185ad5f8"

inherit pypi
inherit native
inherit setuptools3

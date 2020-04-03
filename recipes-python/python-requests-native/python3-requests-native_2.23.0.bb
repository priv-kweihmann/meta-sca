SUMMARY = "Python HTTP Requests for Humans"
HOMEPAGE = "https://github.com/psf/requests"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=19b6be66ed463d93fa88c29f7860bcd7"

DEPENDS += "\
            ${PYTHON_PN}-certifi-native \
            ${PYTHON_PN}-chardet-native \
            ${PYTHON_PN}-idna-native \
            ${PYTHON_PN}-urllib3-native \
           "

PYPI_PACKAGE = "requests"

SRC_URI[md5sum] = "abfdc28db1065bbd0bc32592ac9d27a6"
SRC_URI[sha256sum] = "b3f43d496c6daba4493e7c431722aeb7dbc6288f52a6e04e7b6023b0247817e6"

inherit pypi
inherit native
inherit setuptools3

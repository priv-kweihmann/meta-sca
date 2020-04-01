SUMMARY = "Python HTTP Requests for Humans"
HOMEPAGE = "https://github.com/psf/requests"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=979d6a23b143e13ea0e5e3aa81248820"

DEPENDS += "\
            ${PYTHON_PN}-certifi-native \
            ${PYTHON_PN}-chardet-native \
            ${PYTHON_PN}-idna-native \
            ${PYTHON_PN}-urllib3-native \
           "

PYPI_PACKAGE = "requests2"

SRC_URI[md5sum] = "1f33ee336999c654adad28b152e4c3b7"
SRC_URI[sha256sum] = "f7685b2d620a172053cced288dddf12d4b3441a382cc382821c0f36c02488516"

inherit pypi
inherit native
inherit setuptools3

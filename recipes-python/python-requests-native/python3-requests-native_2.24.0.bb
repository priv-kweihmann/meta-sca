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

SRC_URI[md5sum] = "b54bff26a389e5932e8b1c4983a99ce7"
SRC_URI[sha256sum] = "b3559a131db72c33ee969480840fff4bb6dd111de7dd27c8ee1f820f4f00231b"

inherit pypi
inherit native
inherit setuptools3

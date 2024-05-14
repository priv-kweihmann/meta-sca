SUMMARY = "Python access to maven. nexB advanced patch"
HOMEPAGE = "https://github.com/nexB/pymaven"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "\
            python3-lxml-native \
            python3-pbr-native \
            python3-requests-native \
            "

PYPI_PACKAGE = "pymaven-patch"

SRC_URI[md5sum] = "95bff7bf04a69aafaefae7e91c942f94"
SRC_URI[sha256sum] = "0cf7c93e89f01f0408eb656eec58cb4a228c95e03b3d47cb73d31f899055cd50"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-lxml \
    nativesdk-python3-requests \
"

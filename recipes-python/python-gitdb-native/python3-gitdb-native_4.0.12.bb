SUMMARY = "IO of git-style object databases"
HOMEPAGE = "https://github.com/gitpython-developers/gitdb"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59e5ecb13339a936eedf83282eaf4528"

DEPENDS += "\
            python3-native \
            python3-smmap-native \
           "

PYPI_PACKAGE = "gitdb"

SRC_URI[md5sum] = "13bf7fcb906ead5236d1edc6e6656924"
SRC_URI[sha256sum] = "5ef71f855d191a3326fcfbc0d5da835f26b13fbcba60c32c21091c349ffdb571"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3 \
    nativesdk-python3-smmap \
"

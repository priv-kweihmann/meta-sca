SUMMARY = "Python HTTP Requests for Humans"
HOMEPAGE = "https://github.com/psf/requests"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += "\
            python3-certifi-native \
            python3-chardet-native \
            python3-charset-normalizer-native \
            python3-idna-native \
            python3-urllib3-native \
           "

PYPI_PACKAGE = "requests"

SRC_URI[md5sum] = "8c745949ad3e9ae83d9927fed213db8a"
SRC_URI[sha256sum] = "b8aa58f8cf793ffd8782d3d8cb19e66ef36f7aba4353eec859e74678b01b07a7"

inherit pypi
inherit setuptools3
inherit native

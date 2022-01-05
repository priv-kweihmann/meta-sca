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

SRC_URI[md5sum] = "1a2a343ad35e8cd5a353418f62ec5d64"
SRC_URI[sha256sum] = "8e5643905bf20a308e25e4c1dd379117c09000bf8a82ebccc462cfb1b34a16b5"

inherit pypi
inherit setuptools3
inherit native

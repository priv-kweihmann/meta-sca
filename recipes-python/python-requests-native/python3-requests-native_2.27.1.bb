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

SRC_URI[md5sum] = "bcc01b73974a305cc7c5b092e7d07004"
SRC_URI[sha256sum] = "68d7c56fd5a8999887728ef304a6d12edc7be74f1cfa47714fc8b414525c9a61"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "Internationalization utilities"
HOMEPAGE = "http://babel.pocoo.org/en/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b3f4650099e6d6a73e5a7fc8774ff18"

DEPENDS += "python3-native \
            python3-pytz-native"

PYPI_PACKAGE = "Babel"

SRC_URI[md5sum] = "a846a22016ee41db5d864ec399acc8f8"
SRC_URI[sha256sum] = "98aeaca086133efb3e1e2aad0396987490c8425929ddbcfe0550184fdc54cd13"

inherit pypi
inherit setuptools3
inherit native

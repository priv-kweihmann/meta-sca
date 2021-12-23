SUMMARY = "Internationalization utilities"
HOMEPAGE = "http://babel.pocoo.org/en/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=05fb707293a85504aa67afc8ea34d747"

DEPENDS += "python3-native \
            python3-pytz-native"

PYPI_PACKAGE = "Babel"

SRC_URI[md5sum] = "7166099733d78aa857d74fa50d8ff58c"
SRC_URI[sha256sum] = "bc0c176f9f6a994582230df350aa6e05ba2ebe4b3ac317eab29d9be5d2768da0"

inherit pypi
inherit setuptools3
inherit native

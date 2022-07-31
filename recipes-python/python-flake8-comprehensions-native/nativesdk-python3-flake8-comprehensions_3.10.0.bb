SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dd54c94e040946267bc2300dbc7d7e6d"

DEPENDS += "nativesdk-python3-flake8"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "545288ed86cc6c0a40d43524cdbf1a15"
SRC_URI[sha256sum] = "181158f7e7aa26a63a0a38e6017cef28c6adee71278ce56ce11f6ec9c4905058"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"

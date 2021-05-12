SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0699983c8f8199c37bee38509aacbbc6"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "743b370426d141f89963f64e3604c051"
SRC_URI[sha256sum] = "f24be9032587127f7a5bc6d066bf755b6e66834f694383adb8a673e229c1f559"

inherit pypi
inherit setuptools3
inherit native

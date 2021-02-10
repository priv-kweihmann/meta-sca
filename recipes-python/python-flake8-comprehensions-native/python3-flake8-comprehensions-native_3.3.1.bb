SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e92a537b134e72e9a5eec07b9b122236"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "baac0889696dddd42ff3fd0b479b3010"
SRC_URI[sha256sum] = "e734bf03806bb562886d9bf635d23a65a1a995c251b67d7e007a7b608af9bd22"

inherit pypi
inherit setuptools3
inherit native

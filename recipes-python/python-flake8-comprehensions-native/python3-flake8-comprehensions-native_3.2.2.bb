SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb874cc5b992b19a059b9b3ab8676f07"

DEPENDS += "${PYTHON_PN}-flake8-native"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "645e55becff47ec4089e65034be78dd4"
SRC_URI[sha256sum] = "e7db586bb6eb95afdfd87ed244c90e57ae1352db8ef0ad3012fca0200421e5df"

inherit pypi
inherit native
inherit setuptools3

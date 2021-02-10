
SUMMARY = "Python module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a user data dir"
HOMEPAGE = "https://github.com/ActiveState/appdirs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=31625363c45eb0c67c630a2f73e438e4"

SRC_URI[md5sum] = "d6bca12613174185dd9abc8a29f4f012"
SRC_URI[sha256sum] = "7d5d0167b2b1ba821647616af46a749d1c653740dd0d2415100fe26e27afdf41"

PYPI_PACKAGE = "appdirs"

inherit pypi
inherit setuptools3
inherit native

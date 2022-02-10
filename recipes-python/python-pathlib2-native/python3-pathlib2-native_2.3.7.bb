SUMMARY = "Object-oriented filesystem paths"
HOMEPAGE = "https://github.com/mcmtroffaes/pathlib2"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2dc08586cce3ab91bfa091b655c0e440"

DEPENDS += "python3-six-native"

PYPI_PACKAGE = "pathlib2"

SRC_URI[md5sum] = "ff87562935872cf68f935f8a9e43f84f"
SRC_URI[sha256sum] = "7a4329d67beff9a712e1d3ae147e4e3e108b0bfd284ffdea03a635126c76b3c0"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "Object-oriented filesystem paths"
HOMEPAGE = "https://github.com/mcmtroffaes/pathlib2"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2dc08586cce3ab91bfa091b655c0e440"

DEPENDS += "python3-six-native"

PYPI_PACKAGE = "pathlib2"

SRC_URI[md5sum] = "e50a0cf94e406c5110b3aed535626e9e"
SRC_URI[sha256sum] = "7d8bcb5555003cdf4a8d2872c538faa3a0f5d20630cb360e518ca3b981795e5f"

inherit pypi
inherit setuptools3
inherit native

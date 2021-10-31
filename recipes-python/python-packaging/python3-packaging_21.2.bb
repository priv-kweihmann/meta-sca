SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

DEPENDS += "python3-setuptools-scm-native"
DEPENDS:class-native += "\
    python3-pyparsing-native \
    python3-six-native \
"

PYPI_PACKAGE = "packaging"

SRC_URI[md5sum] = "15576de4a5b2bf4f0e4928d05fdf2351"
SRC_URI[sha256sum] = "096d689d78ca690e4cd8a89568ba06d07ca097e3306a4381635073ca91479966"

inherit pypi
inherit setuptools3

RDEPENDS:${PN}:class-target += "\
    python3-pyparsing \
    python3-six \
"

BBCLASSEXTEND = "native"

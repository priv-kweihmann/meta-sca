SUMMARY = "A concrete syntax tree with AST-like properties for Python 3.5, 3.6, 3.7 and 3.8 programs"
HOMEPAGE = "https://github.com/Instagram/LibCST"

DEFAULT_PREFERENCE = "-1"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acf9a070872c4bc6e8cffc2e9fbd4b8e"

DEPENDS += "\
            python3-pyyaml-native \
            python3-setuptools-scm-native \
            python3-typing-extensions-native \
            python3-typing-inspect-native \
           "

PYPI_PACKAGE = "libcst"

SRC_URI[md5sum] = "76c70e723e74848ce928c293dca0a40c"
SRC_URI[sha256sum] = "0dcfc4c050ec4474f3406e4f92862678eeca97a9a2ad62261ade01c1438bd7ce"

inherit pypi
inherit setuptools3
inherit native

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

SRC_URI[md5sum] = "3214491317d732cf3492fa4798987bdc"
SRC_URI[sha256sum] = "4302a8f09cd9e5ab5962f8e126d032bba98541893dd38cce6b4770969fed059d"

inherit pypi
inherit setuptools3
inherit native

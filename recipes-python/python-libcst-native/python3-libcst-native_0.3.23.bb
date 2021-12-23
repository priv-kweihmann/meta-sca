SUMMARY = "A concrete syntax tree with AST-like properties for Python 3.5, 3.6, 3.7 and 3.8 programs"
HOMEPAGE = "https://github.com/Instagram/LibCST"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acf9a070872c4bc6e8cffc2e9fbd4b8e"

DEPENDS += "\
            python3-pyyaml-native \
            python3-setuptools-scm-native \
            python3-typing-extensions-native \
            python3-typing-inspect-native \
           "

PYPI_PACKAGE = "libcst"

SRC_URI[md5sum] = "500196ae85d79d17bb7db8fe3965855d"
SRC_URI[sha256sum] = "330f9082a309bad808e283e80845a843200303bb256690185b98ca458a62c4f8"

inherit pypi
inherit setuptools3
inherit native

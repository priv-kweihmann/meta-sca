SUMMARY = "A concrete syntax tree with AST-like properties for Python 3.5, 3.6, 3.7 and 3.8 programs"
HOMEPAGE = "https://github.com/Instagram/LibCST"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acf9a070872c4bc6e8cffc2e9fbd4b8e"

DEPENDS += "\
            python3-typing-extensions-native \
            python3-typing-inspect-native \
            python3-pyyaml-native \
           "

PYPI_PACKAGE = "libcst"

SRC_URI[md5sum] = "257622cd6928e2a52f1a1306c589009f"
SRC_URI[sha256sum] = "9d50d4eab28b570e254cc63287ce3009b945be4114c7a29662b67204cfc18060"

inherit pypi
inherit setuptools3
inherit native

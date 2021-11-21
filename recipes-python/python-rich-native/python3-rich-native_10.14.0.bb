SUMMARY = "Render rich text, tables, progress bars, syntax highlighting"
HOMEPAGE = "https://github.com/willmcgugan/rich"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

DEPENDS += "\
            python3-colorama-native \
            python3-commonmark-native \
            python3-pygments-native \
            python3-typing-extensions-native \
           "

PYPI_PACKAGE = "rich"

SRC_URI[md5sum] = "73cfd9cb81121fab9ec42c54f0792f2a"
SRC_URI[sha256sum] = "8bfe4546d56b4131298d3a9e571a0742de342f1593770bd0d4707299f772a0af"

inherit pypi
inherit setuptools3
inherit native

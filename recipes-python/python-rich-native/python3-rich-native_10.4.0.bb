SUMMARY = "Render rich text, tables, progress bars, syntax highlighting"
HOMEPAGE = "https://github.com/willmcgugan/rich"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0d35d5357392e5bfeb0d0a7e6ba4d83"

DEPENDS += "\
            python3-colorama-native \
            python3-commonmark-native \
            python3-pygments-native \
            python3-typing-extensions-native \
           "

PYPI_PACKAGE = "rich"

SRC_URI[md5sum] = "89012ad4cac2abc647139dad6e4133f8"
SRC_URI[sha256sum] = "6e8a3e2c61e6cf6193bfcffbb89865a0973af7779d3ead913fdbbbc33f457c2c"

inherit pypi
inherit setuptools3
inherit native

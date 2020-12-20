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

SRC_URI[md5sum] = "1e201d25043f6ece69e507d6aa02d245"
SRC_URI[sha256sum] = "8b937e2d2c4ff9dcfda8a5910a8cd384bd30f50ec92346d616f62065c662df5f"

inherit pypi
inherit native
inherit setuptools3

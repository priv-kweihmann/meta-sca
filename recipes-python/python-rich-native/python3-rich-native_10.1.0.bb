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

SRC_URI[md5sum] = "f91432fd11ccd28f83abfcf74499eb16"
SRC_URI[sha256sum] = "8f05431091601888c50341697cfc421dc398ce37b12bca0237388ef9c7e2c9e9"

inherit pypi
inherit setuptools3
inherit native

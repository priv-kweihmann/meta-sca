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

SRC_URI[md5sum] = "ac6cedf7da99db4d27d38cf9f7ada29d"
SRC_URI[sha256sum] = "c0d5903b463f015b254d6f52da82af3821d266fe516ae05fdc266e6abba5c3a8"

inherit pypi
inherit native
inherit setuptools3

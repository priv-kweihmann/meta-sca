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

SRC_URI[md5sum] = "2fd13644eb933334684889060d1f13aa"
SRC_URI[sha256sum] = "ca1008c18e91c2d0345764ddb871cc284feadc467241fbb468f14280b791388a"

inherit pypi
inherit native
inherit setuptools3

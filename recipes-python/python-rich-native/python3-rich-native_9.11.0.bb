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

SRC_URI[md5sum] = "20084b3def56a9a4398a727ee0944275"
SRC_URI[sha256sum] = "f8f08fdac6bd67dc2dd7fe976da702d748487aa9eb5d050c48b2321bc67ed659"

inherit pypi
inherit setuptools3
inherit native

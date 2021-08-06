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

SRC_URI[md5sum] = "0a1ba53e9dc370f872488baa4a820d9c"
SRC_URI[sha256sum] = "13ac80676e12cf528dc4228dc682c8402f82577c2aa67191e294350fa2c3c4e9"

inherit pypi
inherit setuptools3
inherit native

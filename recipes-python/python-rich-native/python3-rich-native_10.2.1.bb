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

SRC_URI[md5sum] = "a054803f2d0da7b51ce0569a2ab4e6b5"
SRC_URI[sha256sum] = "34865558d322f7151a3012357caa3622df966e51d7a639e4b1fd1b3675b302fc"

inherit pypi
inherit setuptools3
inherit native

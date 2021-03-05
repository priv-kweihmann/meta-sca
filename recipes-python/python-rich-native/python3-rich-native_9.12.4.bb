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

SRC_URI[md5sum] = "6dbe67f5374048278f81c353b4515e3c"
SRC_URI[sha256sum] = "1e000895221df23cd7f828a9511c15d10189850d4f923b6d8c3d29a32ca95265"

inherit pypi
inherit setuptools3
inherit native

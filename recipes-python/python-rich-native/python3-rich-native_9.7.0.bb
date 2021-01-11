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

SRC_URI[md5sum] = "aa7ca0f71936a5e17542b54b0a838d9a"
SRC_URI[sha256sum] = "25583ce533afae71de086ca97cf0aa883a5e1a220dfcc6049a2809a74bc79ca0"

inherit pypi
inherit native
inherit setuptools3

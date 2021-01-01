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

SRC_URI[md5sum] = "7fff13ecd8214113875b9a7aa656ae25"
SRC_URI[sha256sum] = "5ac9f4f7f6b0e32e7e412de127f15b94144e22c9a7896551474d640143bbaa7b"

inherit pypi
inherit native
inherit setuptools3

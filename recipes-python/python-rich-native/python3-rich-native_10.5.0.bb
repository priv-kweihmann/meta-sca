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

SRC_URI[md5sum] = "4fe40fcb0569724f22a9c10410bdfcf0"
SRC_URI[sha256sum] = "f8a16484b3d70708bdafd04f659f9ca0e2c0129b33a343c10c734838d361777f"

inherit pypi
inherit setuptools3
inherit native

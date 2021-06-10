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

SRC_URI[md5sum] = "8a83047220975a12596487d0d464cc1f"
SRC_URI[sha256sum] = "a83bff83309687e1859c75b499879738b135d700738dd2721c22965497af05bd"

inherit pypi
inherit setuptools3
inherit native

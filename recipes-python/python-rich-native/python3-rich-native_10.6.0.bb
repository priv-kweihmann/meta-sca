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

SRC_URI[md5sum] = "9ef916f9703fc302fffb65438b533803"
SRC_URI[sha256sum] = "128261b3e2419a4ef9c97066ccc2abbfb49fa7c5e89c3fe4056d00aa5e9c1e65"

inherit pypi
inherit setuptools3
inherit native

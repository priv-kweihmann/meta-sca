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

SRC_URI[md5sum] = "fdb855ea5801cd3b7931e56306ef7164"
SRC_URI[sha256sum] = "bacf58b25fea6b920446fe4e7abdc6c7664c4530c4098e7a1bc79b16b8551dfa"

inherit pypi
inherit setuptools3
inherit native

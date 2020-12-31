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

SRC_URI[md5sum] = "cfc6747f5cb38bcf26434628a96fdb26"
SRC_URI[sha256sum] = "ae7f5f24fc90c76ccb54883f4bd633cbd146e0bbe3e070275ca97038ce53cf2f"

inherit pypi
inherit native
inherit setuptools3

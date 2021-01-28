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

SRC_URI[md5sum] = "77757b092e89566b8434989818bc3e5a"
SRC_URI[sha256sum] = "e0f2db62a52536ee32f6f584a47536465872cae2b94887cf1f080fb9eaa13eb2"

inherit pypi
inherit native
inherit setuptools3

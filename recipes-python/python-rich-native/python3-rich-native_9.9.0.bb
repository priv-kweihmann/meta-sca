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

SRC_URI[md5sum] = "089597c67eb5a20535720e2e5378f1d3"
SRC_URI[sha256sum] = "0bd8f42c3a03b7ef5e311d5e37f47bea9d268f541981c169072be5869c007957"

inherit pypi
inherit native
inherit setuptools3

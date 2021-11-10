SUMMARY = "Render rich text, tables, progress bars, syntax highlighting"
HOMEPAGE = "https://github.com/willmcgugan/rich"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

DEPENDS += "\
            python3-colorama-native \
            python3-commonmark-native \
            python3-pygments-native \
            python3-typing-extensions-native \
           "

PYPI_PACKAGE = "rich"

SRC_URI[md5sum] = "78964a8ec5df33ebb82aec797e06c5ee"
SRC_URI[sha256sum] = "d80fc76f34d819c481a48f73ec9ac396bed3bd6a16ecd57f9e0654cd89a8fb56"

inherit pypi
inherit setuptools3
inherit native

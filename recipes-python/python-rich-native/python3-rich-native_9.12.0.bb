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

SRC_URI[md5sum] = "3a9419a05c75f4659a070aaffe9822ce"
SRC_URI[sha256sum] = "27e3deb24555d7dad554afa871c7e77f16a0336a625ed78dd10de21193b4ec11"

inherit pypi
inherit setuptools3
inherit native

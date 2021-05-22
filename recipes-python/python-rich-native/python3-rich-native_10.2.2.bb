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

SRC_URI[md5sum] = "ad562a17a029666edb058d0cfaf0ce56"
SRC_URI[sha256sum] = "17b3f486c38e79cc219d8848974b277ef532a82d12b3ad6eb37bb8c6f22ab5fc"

inherit pypi
inherit setuptools3
inherit native

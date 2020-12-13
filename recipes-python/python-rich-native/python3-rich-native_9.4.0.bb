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

SRC_URI[md5sum] = "48d859722f930ccb91c352c3bdd08b68"
SRC_URI[sha256sum] = "bde23a1761373fed2802502ff98292c5d735a5389ed96f4fe1be5fb4c2cde8ea"

inherit pypi
inherit native
inherit setuptools3

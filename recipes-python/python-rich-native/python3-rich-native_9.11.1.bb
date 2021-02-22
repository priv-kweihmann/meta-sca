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

SRC_URI[md5sum] = "d5979322256cd44c19c8da58dba5b60f"
SRC_URI[sha256sum] = "86a157008d17c73ee03da80de91e09fc2f7713109ccd4e90496eeb3702bef638"

inherit pypi
inherit setuptools3
inherit native

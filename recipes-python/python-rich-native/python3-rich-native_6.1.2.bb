SUMMARY = "Render rich text, tables, progress bars, syntax highlighting"
HOMEPAGE = "https://github.com/willmcgugan/rich"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0d35d5357392e5bfeb0d0a7e6ba4d83"

DEPENDS += "\
            python3-colorama-native \
            python3-commonmark-native \
            ${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') == 3.6, 'python3-dataclasses-native', '')} \
            python3-pygments-native \
            python3-typing-extensions-native \
           "

PYPI_PACKAGE = "rich"

SRC_URI[md5sum] = "572b45eb9ace33cbd16aecff450958e6"
SRC_URI[sha256sum] = "b316b5e8b167cd562d4315cf6c80399c253df444143e2053f593372bb2056ea4"

inherit pypi
inherit native
inherit setuptools3

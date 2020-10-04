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

SRC_URI[md5sum] = "72fb90925197d805125ff6af4df9b022"
SRC_URI[sha256sum] = "1b5023d2241e6552a24ddfe830a853fc8e53da4e6a6ed6c7105bb262593edf97"

inherit pypi
inherit native
inherit setuptools3

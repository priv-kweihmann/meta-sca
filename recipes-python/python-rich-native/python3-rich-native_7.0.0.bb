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

SRC_URI[md5sum] = "fa1736b621011228245b2569ea603729"
SRC_URI[sha256sum] = "291700f5c09fae83676f44781d01a292c39efad9505dd4724899646b794f9afb"

inherit pypi
inherit native
inherit setuptools3

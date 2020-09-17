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

SRC_URI[md5sum] = "cc8b0224715cac9421d17ba5fc6c2857"
SRC_URI[sha256sum] = "f99c877277906e1ff83b135c564920590ba31188f424dcdb5d1cae652a519b4b"

inherit pypi
inherit native
inherit setuptools3

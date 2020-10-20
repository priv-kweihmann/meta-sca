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

SRC_URI[md5sum] = "f4c47cd070a82b97fa984c57a27f9b13"
SRC_URI[sha256sum] = "1208bc46dda7ca120b308f20f96f47f731837a2f99a16a116b8e320751ecb7b0"

inherit pypi
inherit native
inherit setuptools3

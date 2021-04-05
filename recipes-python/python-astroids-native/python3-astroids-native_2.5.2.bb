SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += "\
            python3-native \
            python3-pylazy-object-proxy-native \
            python3-pytest-runner-native \
            python3-typed-ast-native \
            python3-wrapt-native \
            "

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "38c7176fbb623c28a99e398a5d896f39"
SRC_URI[sha256sum] = "6b0ed1af831570e500e2437625979eaa3b36011f66ddfc4ce930128610258ca9"

inherit pypi
inherit setuptools3
inherit native

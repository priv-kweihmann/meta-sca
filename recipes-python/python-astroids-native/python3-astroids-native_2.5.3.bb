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

SRC_URI[md5sum] = "f10e7c2a8f4100ba4ab1451c0ada6dd2"
SRC_URI[sha256sum] = "ad63b8552c70939568966811a088ef0bc880f99a24a00834abd0e3681b514f91"

inherit pypi
inherit setuptools3
inherit native

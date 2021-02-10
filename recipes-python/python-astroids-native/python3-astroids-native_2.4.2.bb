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

SRC_URI_append = " file://ae3a2d8cf263f39651139891916bc6f5797c9713.patch"

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "b54e1325995d3a9abd84bac91d4d5867"
SRC_URI[sha256sum] = "2f4078c2a41bf377eea06d71c9d2ba4eb8f6b1af2135bec27bbbb7d8f12bb703"

inherit pypi
inherit setuptools3
inherit native

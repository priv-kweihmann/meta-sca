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

SRC_URI[md5sum] = "ada7b4df6243a4506de0efb8442ae596"
SRC_URI[sha256sum] = "b31c92f545517dcc452f284bc9c044050862fbe6d93d2b3de4a215a6b384bf0d"

inherit pypi
inherit setuptools3
inherit native

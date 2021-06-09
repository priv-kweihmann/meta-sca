SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a70cf540abf41acb644ac3b621b2fad1"

DEPENDS += "\
            python3-native \
            python3-pylazy-object-proxy-native \
            python3-pytest-runner-native \
            python3-typed-ast-native \
            python3-wrapt-native \
            "

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "365043dbd1fd6c53194ada419eac1860"
SRC_URI[sha256sum] = "2476b7f0d6cec13f4c1f53b54bea2ce072310ac9fc7acb669d5270190c748042"

inherit pypi
inherit setuptools3
inherit native

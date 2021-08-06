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

SRC_URI[md5sum] = "630db44f7adbcdf837d5d659eb043ebd"
SRC_URI[sha256sum] = "3975a0bd5373bdce166e60c851cfcbaf21ee96de80ec518c1f4cb3e94c3fb334"

inherit pypi
inherit setuptools3
inherit native

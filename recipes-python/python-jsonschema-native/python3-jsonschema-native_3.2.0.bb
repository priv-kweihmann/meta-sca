SUMMARY = "An(other) implementation of JSON Schema for Python"
HOMEPAGE = "https://github.com/Julian/jsonschema"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7a60a81c146ec25599a3e1dabb8610a8"

DEPENDS += "\
            python3-attrs-native \
            ${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or 0.0) < 3.8, 'python3-importlib_metadata-native', '')} \
            python3-pyrsistent-native \
            python3-setuptools-scm-native \
            python3-six-native \
           "

PYPI_PACKAGE = "jsonschema"

SRC_URI[md5sum] = "f1a0b5011f05a02a8dee1070cd10a26d"
SRC_URI[sha256sum] = "c8a85b28d377cc7737e46e2d9f2b4f44ee3c0e1deac6bf46ddefc7187d30797a"

inherit pypi
inherit setuptools3
inherit native

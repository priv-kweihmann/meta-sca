SUMMARY = "An(other) implementation of JSON Schema for Python"
HOMEPAGE = "https://github.com/Julian/jsonschema"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7a60a81c146ec25599a3e1dabb8610a8"

DEPENDS += "\
            ${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') < 3.9, 'python3-importlib-resources-native', '')} \
            python3-attrs-native \
            python3-importlib-metadata-native \
            python3-packaging-native \
            python3-pyrsistent-native \
            python3-setuptools-scm-native \
           "

PYPI_PACKAGE = "jsonschema"

SRC_URI[sha256sum] = "f210d4ce095ed1e8af635d15c8ee79b586f656ab54399ba87b8ab87e5bff0ade"

inherit pypi
inherit setuptools3
inherit sca-setuptools-legacy
inherit native

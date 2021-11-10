SUMMARY = "An(other) implementation of JSON Schema for Python"
HOMEPAGE = "https://github.com/Julian/jsonschema"

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

SRC_URI[sha256sum] = "e2d3601321ac74d38214e2853300ae740cd07e53d919a15862b8c71f9d840574"

inherit pypi
inherit setuptools3
inherit native

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup
setup(name="jsonschema", version="${PV}", packages=["jsonschema"], package_data={"jsonschema": ["schemas/*.json", "schemas/*/*.json"]})
EOF
}

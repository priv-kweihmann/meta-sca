SUMMARY = "An(other) implementation of JSON Schema for Python"
HOMEPAGE = "https://github.com/Julian/jsonschema"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7a60a81c146ec25599a3e1dabb8610a8"

DEPENDS += "\
            python3-attrs-native \
            python3-packaging-native \
            python3-setuptools-scm-native \
           "

PYPI_PACKAGE = "jsonschema"

SRC_URI[sha256sum] = "2a5ea0da054a759732ca60f19171fccf32649b1b4a5734e5988fec0087860910"

inherit pypi
inherit setuptools3
inherit native

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup
setup(name="jsonschema", version="${PV}", packages=["jsonschema"], package_data={"": ["*"]})
EOF
}

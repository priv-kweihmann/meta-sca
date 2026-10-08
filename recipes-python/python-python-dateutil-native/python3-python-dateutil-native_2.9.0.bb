SUMMARY = "dateutil - powerful extensions to datetime"
HOMEPAGE = "https://github.com/dateutil/dateutil"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 OR BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3155c7bdc71f66e02678411d2abf996"

DEPENDS += "\
    python3-setuptools-scm-native \
    python3-six-native \
    python3-wheel-native \
"

PYPI_PACKAGE = "python-dateutil"

SRC_URI[sha256sum] = "78e73e19c63f5b20ffa567001531680d939dc042bf7850431877645523c66709"

PYPI_ESCAPE_PACKAGE_NAME = "0"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

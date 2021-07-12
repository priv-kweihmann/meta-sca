SUMMARY = "dateutil - powerful extensions to datetime"
HOMEPAGE = "https://github.com/dateutil/dateutil"

LICENSE = "BSD-3-Clause | Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3155c7bdc71f66e02678411d2abf996"

DEPENDS += "\
    python3-setuptools-scm-native \
    python3-six-native \
"

PYPI_PACKAGE = "python-dateutil"

SRC_URI[sha256sum] = "73ebfe9dbf22e832286dafa60473e4cd239f8592f699aa5adaf10050e6e1823c"

inherit pypi
inherit setuptools3
inherit native

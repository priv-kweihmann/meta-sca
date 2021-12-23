SUMMARY = "dateutil - powerful extensions to datetime"
HOMEPAGE = "https://github.com/dateutil/dateutil"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause | Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3155c7bdc71f66e02678411d2abf996"

DEPENDS += "\
    python3-setuptools-scm-native \
    python3-six-native \
"

PYPI_PACKAGE = "python-dateutil"

SRC_URI[sha256sum] = "0123cacc1627ae19ddf3c27a5de5bd67ee4586fbdd6440d9748f8abb483d3e86"

inherit pypi
inherit setuptools3
inherit native

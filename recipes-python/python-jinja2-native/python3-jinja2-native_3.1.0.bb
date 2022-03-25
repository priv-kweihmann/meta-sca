SUMMARY = "A small but fast and easy to use template engine written in pure python"
HOMEPAGE = "https://github.com/pallets/jinja"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

DEPENDS += "python3-markupsafe"

SRC_URI[md5sum] = "381b03ab920c5d43a37d7189c8af0dd8"
SRC_URI[sha256sum] = "a2f09a92f358b96b5f6ca6ecb4502669c4acb55d8733bbb2b2c9c4af5564c605"

PYPI_PACKAGE = "Jinja2"

inherit setuptools3
inherit pypi
inherit native

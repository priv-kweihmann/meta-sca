SUMMARY = "A small but fast and easy to use template engine written in pure python"
HOMEPAGE = "https://github.com/pallets/jinja"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

DEPENDS += "${PYTHON_PN}-markupsafe"

SRC_URI[md5sum] = "0362203b22547abca06ed1082bc1e7b4"
SRC_URI[sha256sum] = "89aab215427ef59c34ad58735269eb58b1a5808103067f7bb9d5836c651b3bb0"

PYPI_PACKAGE = "Jinja2"

inherit setuptools3
inherit pypi

RDEPENDS_${PN} += "${PYTHON_PN}-markupsafe"

BBCLASSEXTEND = "native"

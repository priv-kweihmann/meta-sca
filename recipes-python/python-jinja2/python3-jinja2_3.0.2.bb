SUMMARY = "A small but fast and easy to use template engine written in pure python"
HOMEPAGE = "https://github.com/pallets/jinja"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

DEPENDS += "python3-markupsafe"

SRC_URI[md5sum] = "059f89375d7ea60eb7013f341f0b89e7"
SRC_URI[sha256sum] = "827a0e32839ab1600d4eb1c4c33ec5a8edfbc5cb42dafa13b81f182f97784b45"

PYPI_PACKAGE = "Jinja2"

inherit setuptools3
inherit pypi

RDEPENDS:${PN} += "python3-markupsafe"

BBCLASSEXTEND = "native"

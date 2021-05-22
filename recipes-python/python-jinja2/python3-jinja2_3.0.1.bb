SUMMARY = "A small but fast and easy to use template engine written in pure python"
HOMEPAGE = "https://github.com/pallets/jinja"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

DEPENDS += "python3-markupsafe"

SRC_URI[md5sum] = "25ba6ef98c164878acff1036fbd72a1d"
SRC_URI[sha256sum] = "703f484b47a6af502e743c9122595cc812b0271f661722403114f71a79d0f5a4"

PYPI_PACKAGE = "Jinja2"

inherit setuptools3
inherit pypi

RDEPENDS_${PN} += "python3-markupsafe"

BBCLASSEXTEND = "native"

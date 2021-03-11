SUMMARY = "A small but fast and easy to use template engine written in pure python"
HOMEPAGE = "https://github.com/pallets/jinja"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

DEPENDS += "python3-markupsafe"

SRC_URI[md5sum] = "231dc00d34afb2672c497713fa9cdaaa"
SRC_URI[sha256sum] = "a6d58433de0ae800347cab1fa3043cebbabe8baa9d29e668f1c768cb87a333c6"

PYPI_PACKAGE = "Jinja2"

inherit setuptools3
inherit pypi

RDEPENDS_${PN} += "python3-markupsafe"

BBCLASSEXTEND = "native"

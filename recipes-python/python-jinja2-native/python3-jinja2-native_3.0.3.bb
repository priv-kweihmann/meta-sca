SUMMARY = "A small but fast and easy to use template engine written in pure python"
HOMEPAGE = "https://github.com/pallets/jinja"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

DEPENDS += "python3-markupsafe"

SRC_URI[md5sum] = "b76ae2f0647abebc81e7c03f5fb7b00f"
SRC_URI[sha256sum] = "611bb273cd68f3b993fabdc4064fc858c5b47a973cb5aa7999ec1ba405c87cd7"

PYPI_PACKAGE = "Jinja2"

inherit setuptools3
inherit pypi
inherit native

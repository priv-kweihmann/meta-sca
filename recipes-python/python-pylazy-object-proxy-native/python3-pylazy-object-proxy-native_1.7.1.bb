SUMMARY = "A fast and thorough lazy object proxy for Python"
HOMEPAGE = "https://python-lazy-object-proxy.readthedocs.io/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9c5c2c74370826468065c5702b8a1fcf"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "lazy-object-proxy"

SRC_URI[md5sum] = "53e3ebae55a1b2568bee8a977f48dc98"
SRC_URI[sha256sum] = "d609c75b986def706743cdebe5e47553f4a5a1da9c5ff66d76013ef396b5a8a4"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "A fast and thorough lazy object proxy for Python"
HOMEPAGE = "https://python-lazy-object-proxy.readthedocs.io/"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9c5c2c74370826468065c5702b8a1fcf"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "lazy-object-proxy"

SRC_URI[md5sum] = "27b3e5be681a99da9a523d7cc4c21615"
SRC_URI[sha256sum] = "5944a9b95e97de1980c65f03b79b356f30a43de48682b8bdd90aa5089f0ec1f4"

inherit pypi
inherit setuptools3
inherit native

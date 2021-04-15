SUMMARY = "Resolve abstract dependencies into concrete ones"
HOMEPAGE = "https://github.com/sarugaku/resolvelib"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78e1c0248051c32a38a7f820c30bd7a5"

PYPI_PACKAGE = "resolvelib"

SRC_URI[md5sum] = "24614cf9f95c57abf2eb534e45817bc1"
SRC_URI[sha256sum] = "8840a8bf49fd56cff51398ebfe090e5d6aeaf4c4102472bff006aca7db470868"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"

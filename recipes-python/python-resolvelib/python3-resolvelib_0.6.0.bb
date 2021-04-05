SUMMARY = "Resolve abstract dependencies into concrete ones"
HOMEPAGE = "https://github.com/sarugaku/resolvelib"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78e1c0248051c32a38a7f820c30bd7a5"

PYPI_PACKAGE = "resolvelib"

SRC_URI[md5sum] = "90f3bb39465e187e3d59b80e2de3579e"
SRC_URI[sha256sum] = "9da653f664be0fba1a1ee9b339f0046a84d084e5c1bcab0469eab941a63f5117"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"

SUMMARY = "Resolve abstract dependencies into concrete ones"
HOMEPAGE = "https://github.com/sarugaku/resolvelib"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78e1c0248051c32a38a7f820c30bd7a5"

PYPI_PACKAGE = "resolvelib"

SRC_URI[md5sum] = "98078e0fcd9366278f64af522cd124fa"
SRC_URI[sha256sum] = "9b9b80d5c60e4c2a8b7fbf0712c3449dc01d74e215632e5199850c9eca687628"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"

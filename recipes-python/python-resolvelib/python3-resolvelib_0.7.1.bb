SUMMARY = "Resolve abstract dependencies into concrete ones"
HOMEPAGE = "https://github.com/sarugaku/resolvelib"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78e1c0248051c32a38a7f820c30bd7a5"

PYPI_PACKAGE = "resolvelib"

SRC_URI[md5sum] = "361554590957f23e0b3953e2b47adfd9"
SRC_URI[sha256sum] = "c526cda7f080d908846262d86c738231d9bfb556eb02d77167b685d65d85ace9"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"

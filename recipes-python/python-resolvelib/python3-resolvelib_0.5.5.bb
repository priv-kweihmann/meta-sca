SUMMARY = "Resolve abstract dependencies into concrete ones"
HOMEPAGE = "https://github.com/sarugaku/resolvelib"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78e1c0248051c32a38a7f820c30bd7a5"

PYPI_PACKAGE = "resolvelib"

SRC_URI[md5sum] = "7bd585766bcb3cc0e64e316f1104969a"
SRC_URI[sha256sum] = "123de56548c90df85137425a3f51eb93df89e2ba719aeb6a8023c032758be950"

inherit pypi
inherit setuptools3
inherit sca-nosca

BBCLASSEXTEND = "native"

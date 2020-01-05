SUMMARY = "C parser in Python."
DESCRIPTION = "C parser in Python."
HOMEPAGE = "https://github.com/eliben/pycparser"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86f1cedb4e6410a88ce8e30b91079169"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "pycparser"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "76396762adc3fa769c83d8e202d36b6f"
SRC_URI[sha256sum] = "a988718abfad80b6b157acce7bf130a30876d27603738ac39f140993246b25b3"

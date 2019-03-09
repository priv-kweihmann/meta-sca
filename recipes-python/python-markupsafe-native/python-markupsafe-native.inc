SUMMARY = "Safely add untrusted strings to HTML/XML markup."
DESCRIPTION = "Safely add untrusted strings to HTML/XML markup."
HOMEPAGE = "https://github.com/pallets/markupsafe"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "MarkupSafe"

inherit pypi

FILES_${PN} += "${datadir}/MarkupSafe"

inherit native

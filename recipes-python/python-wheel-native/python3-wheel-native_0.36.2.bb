SUMMARY = "The official binary distribution format for Python"
HOMEPAGE = "https://github.com/pypa/wheel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE.txt;md5=9d66b41bc2a080e7174acc5dffecd752"

SRC_URI_append = "  https://raw.githubusercontent.com/pypa/wheel/${PV}/LICENSE.txt;name=license"
SRC_URI[license.sha256sum] = "cca9e20c6af1fcfbf69408f377769286cbeebcded336100c9b4a3f35fbe635e4"

PYPI_PACKAGE = "wheel"

SRC_URI[md5sum] = "800401c0549ea01449dc47305858c833"
SRC_URI[sha256sum] = "e11eefd162658ea59a60a0f6c7d493a7190ea4b9a85e335b33489d9f17e0245e"

inherit pypi
inherit setuptools3
inherit native

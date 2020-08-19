SUMMARY = "The official binary distribution format for Python"
HOMEPAGE = "https://github.com/pypa/wheel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE.txt;md5=9d66b41bc2a080e7174acc5dffecd752"

SRC_URI_append = "  https://raw.githubusercontent.com/pypa/wheel/${PV}/LICENSE.txt;name=license"
SRC_URI[license.sha256sum] = "cca9e20c6af1fcfbf69408f377769286cbeebcded336100c9b4a3f35fbe635e4"

PYPI_PACKAGE = "wheel"

SRC_URI[md5sum] = "7ec7c435cc73eefebd9f0af43c120044"
SRC_URI[sha256sum] = "99a22d87add3f634ff917310a3d87e499f19e663413a52eb9232c447aa646c9f"

inherit pypi
inherit setuptools3
inherit native

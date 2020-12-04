SUMMARY = "The official binary distribution format for Python"
HOMEPAGE = "https://github.com/pypa/wheel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE.txt;md5=9d66b41bc2a080e7174acc5dffecd752"

SRC_URI_append = "  https://raw.githubusercontent.com/pypa/wheel/${PV}/LICENSE.txt;name=license"
SRC_URI[license.sha256sum] = "cca9e20c6af1fcfbf69408f377769286cbeebcded336100c9b4a3f35fbe635e4"

PYPI_PACKAGE = "wheel"

SRC_URI[md5sum] = "155170d46d4de0794b7aac020c44260d"
SRC_URI[sha256sum] = "aaef9b8c36db72f8bf7f1e54f85f875c4d466819940863ca0b3f3f77f0a1646f"

inherit pypi
inherit setuptools3
inherit native

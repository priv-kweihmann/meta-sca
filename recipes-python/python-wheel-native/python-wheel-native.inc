SUMMARY = "The official binary distribution format for Python "
DESCRIPTION = "The official binary distribution format for Python "
HOMEPAGE = "https://github.com/pypa/wheel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9d66b41bc2a080e7174acc5dffecd752"

PYPI_PACKAGE = "wheel"

inherit pypi

FILES_${PN} += "${datadir}/wheel"

inherit native

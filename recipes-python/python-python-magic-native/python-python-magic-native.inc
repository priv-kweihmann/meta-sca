SUMMARY = "A python wrapper for libmagic"
DESCRIPTION = "A python wrapper for libmagic"
HOMEPAGE = "https://github.com/ahupp/python-magic"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=16a934f165e8c3245f241e77d401bb88"

PYPI_PACKAGE = "python-magic"

DEPENDS += "file"

inherit pypi

FILES_${PN} += "${datadir}/python-magic"

inherit native
SUMMARY = "Python 3.3's ipaddress for older Python versions"
DESCRIPTION = "Python 3.3's ipaddress for older Python versions"
HOMEPAGE = "https://github.com/phihag/ipaddress"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7f538584cc3407bf76042def7168548a"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "ipaddress"

inherit pypi

inherit native

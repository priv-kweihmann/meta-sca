SUMMARY = "A drop-in replacement for argparse."
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables. "
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "ConfigArgParse"

inherit pypi

FILES_${PN} += "${datadir}/ConfigArgParse"

inherit native

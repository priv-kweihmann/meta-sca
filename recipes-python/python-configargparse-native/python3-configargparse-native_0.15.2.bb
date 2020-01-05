SUMMARY = "A drop-in replacement for argparse."
DESCRIPTION = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables. "
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

RDEPENDS_${PN} += "${PYTHON_PN}-native"

PYPI_PACKAGE = "ConfigArgParse"

inherit pypi
inherit setuptools3
inherit native

SRC_URI[md5sum] = "315d1043134d6405f0f312d9c98933e8"
SRC_URI[sha256sum] = "558738aff623d6667aa5b85df6093ad3828867de8a82b66a6d458fb42567beb3"

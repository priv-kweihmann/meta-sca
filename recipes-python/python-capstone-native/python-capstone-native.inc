DESCRIPTION = "Capstone disassembly/disassembler framework"
HOMEPAGE = "https://github.com/aquynh/capstone"
LIC_FILES_CHKSUM = "file://LICENSE.TXT;md5=1cfbff4f40612b0144e498a47c91499c"
LICENSE = "BSD-3-Clause"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "capstone"

inherit pypi
inherit native

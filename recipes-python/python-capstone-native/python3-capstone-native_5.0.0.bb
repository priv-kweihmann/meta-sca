DESCRIPTION = "Capstone disassembly/disassembler framework"
HOMEPAGE = "https://github.com/aquynh/capstone"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.TXT;md5=1cfbff4f40612b0144e498a47c91499c"

PYPI_PACKAGE = "capstone"

SRC_URI[md5sum] = "a35caae78eb868e5f7516cab404a07db"
SRC_URI[sha256sum] = "6e18ee140463881c627b7ff7fd655752ddf37d9036295d3dba7b130408fbabaf"

inherit pypi
inherit setuptools3
inherit native

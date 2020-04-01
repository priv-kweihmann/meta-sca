DESCRIPTION = "Capstone disassembly/disassembler framework"
HOMEPAGE = "https://github.com/aquynh/capstone"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.TXT;md5=1cfbff4f40612b0144e498a47c91499c"

PYPI_PACKAGE = "capstone"

SRC_URI[md5sum] = "250e3b5fbb9d6a2472bbf5eab4842189"
SRC_URI[sha256sum] = "5857accc0de1e769b0ec0a0ca985715bfa96e5a66a2ebb3aaed43a8e3655377f"

inherit pypi
inherit native
inherit setuptools3

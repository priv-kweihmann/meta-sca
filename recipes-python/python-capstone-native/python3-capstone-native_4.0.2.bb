DESCRIPTION = "Capstone disassembly/disassembler framework"
HOMEPAGE = "https://github.com/aquynh/capstone"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.TXT;md5=1cfbff4f40612b0144e498a47c91499c"

PYPI_PACKAGE = "capstone"

SRC_URI[md5sum] = "96215136924b612ddd4e05742c02cbff"
SRC_URI[sha256sum] = "2842913092c9b69fd903744bc1b87488e1451625460baac173056e1808ec1c66"

inherit pypi
inherit setuptools3
inherit native

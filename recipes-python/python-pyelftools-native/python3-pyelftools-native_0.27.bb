SUMMARY = "Parsing ELF and DWARF in Python"
HOMEPAGE = "https://github.com/eliben/pyelftools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PYELFTOOLS"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ce2a2b07fca326bc7c146d10105ccfc"

PYPI_PACKAGE = "pyelftools"

SRC_URI[md5sum] = "061d67c669a9b1f8d07f28c47fb6a65f"
SRC_URI[sha256sum] = "cde854e662774c5457d688ca41615f6594187ba7067af101232df889a6b7a66b"

inherit pypi
inherit setuptools3
inherit native

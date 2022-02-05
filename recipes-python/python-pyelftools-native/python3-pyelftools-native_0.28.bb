SUMMARY = "Parsing ELF and DWARF in Python"
HOMEPAGE = "https://github.com/eliben/pyelftools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PYELFTOOLS"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5ce2a2b07fca326bc7c146d10105ccfc"

PYPI_PACKAGE = "pyelftools"

SRC_URI[md5sum] = "2681e4603c42fe127a516f253abd8b6f"
SRC_URI[sha256sum] = "53e5609cac016471d40bd88dc410cd90755942c25e58a61021cfdf7abdfeacff"

inherit pypi
inherit setuptools3
inherit native

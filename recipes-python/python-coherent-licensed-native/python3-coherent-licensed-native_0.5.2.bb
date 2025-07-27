SUMMARY = "License management tooling for Coherent System and skeleton projects"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1aeae65f25a15b1e46d4381f2f094e0a"

SRC_URI[sha256sum] = "d8071403ce742d3ac3592ddc4fb7057a46caffb415b928b4d52802e5f208416d"

inherit pypi
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "coherent_licensed"

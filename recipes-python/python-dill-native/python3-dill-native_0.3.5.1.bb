SUMMARY = "dill extends pythons pickle module"
HOMEPAGE = "https://github.com/uqfoundation/dill"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61f24e44fc855bde43ed5a1524a37bc4"

PYPI_PACKAGE = "dill"

SRC_URI[sha256sum] = "d75e41f3eff1eee599d738e76ba8f4ad98ea229db8b085318aa2b3333a208c86"

inherit pypi
inherit setuptools3
inherit native

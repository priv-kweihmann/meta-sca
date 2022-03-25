SUMMARY = "dill extends pythons pickle module"
HOMEPAGE = "https://github.com/uqfoundation/dill"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=41adceb584fdde8323ddf9ad23c07fe5"

PYPI_PACKAGE = "dill"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[sha256sum] = "9f9734205146b2b353ab3fec9af0070237b6ddae78452af83d2fca84d739e675"

inherit pypi
inherit setuptools3
inherit native

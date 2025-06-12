SUMMARY = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI[md5sum] = "438cfd4974584ae4f960ffeab32e8991"
SRC_URI[sha256sum] = "27c491cc05d968d271d5a1db13e3b5a184636d9d930f148c50b038f0d0646202"

PYPI_PACKAGE = "click"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-ctypes \
    nativesdk-python3-datetime \
    nativesdk-python3-io \
    nativesdk-python3-shell \
"

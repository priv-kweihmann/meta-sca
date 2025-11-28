SUMMARY = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI[md5sum] = "5f89d725a424b101607ec40927f78773"
SRC_URI[sha256sum] = "12ff4785d337a1bb490bb7e9c2b1ee5da3112e94a8622f26a6c77f5d2fc6842a"

PYPI_PACKAGE = "click"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-ctypes \
    nativesdk-python3-datetime \
    nativesdk-python3-io \
    nativesdk-python3-shell \
"

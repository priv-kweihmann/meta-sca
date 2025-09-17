SUMMARY = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI[md5sum] = "2b12ffb230a22fd5aabe301ade045b4a"
SRC_URI[sha256sum] = "068616e6ef9705a07b6db727cb9c248f4eb9dae437a30239f56fa94b18b852ef"

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

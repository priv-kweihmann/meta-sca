SUMMARY = "Implements boolean algebra in one module"
HOMEPAGE = "https://github.com/bastikr/boolean.py"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d118b5feceee598ebeca76e13395c2bd"

PYPI_PACKAGE = "boolean.py"

SRC_URI[md5sum] = "5a8b0eae254b0c37a1bdde38c6bd5b5d"
SRC_URI[sha256sum] = "17b9a181630e43dde1851d42bef546d616d5d9b4480357514597e78b203d06e4"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

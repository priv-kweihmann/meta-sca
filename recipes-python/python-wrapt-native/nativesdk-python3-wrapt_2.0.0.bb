SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=945f689eb1f8c581bb9d635baba5abb5"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "bdc6d3460db4cdee3383dfe318b5c317"
SRC_URI[sha256sum] = "35a542cc7a962331d0279735c30995b024e852cf40481e384fd63caaa391cbb9"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
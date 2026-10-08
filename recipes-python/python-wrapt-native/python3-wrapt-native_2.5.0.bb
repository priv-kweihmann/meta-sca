SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63a78af2900bfcc5ce482f3b8d445898"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "62a3f2bb129e77c859aaacff584c53a6"
SRC_URI[sha256sum] = "c48cdb6c904dca76d9915a579e4a5fab6b0c25f650c1019ce78a78effaf7a345"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63a78af2900bfcc5ce482f3b8d445898"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "e235838e46cbca0c9ac504555ebcba70"
SRC_URI[sha256sum] = "551cb49e88b3722faad780303833bc4fa70685fb1773270fb98b40d39d9fddbf"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63a78af2900bfcc5ce482f3b8d445898"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "e6ee7504e97b94afcaa76ba2c7cc916a"
SRC_URI[sha256sum] = "5fdcb09bf6db023d88f312bd0767594b414655d58090fc1c46b3414415f67fac"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63a78af2900bfcc5ce482f3b8d445898"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "72d33ea0847494bcc309646743b4908a"
SRC_URI[sha256sum] = "3996a67eecc2c68fd47b4e3c564405a5777367adfd9b8abb58387b63ee83b21e"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
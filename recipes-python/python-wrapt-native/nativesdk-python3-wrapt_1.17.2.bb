SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dc34cbad60bc961452eb7ade801d25f7"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "f4db93e73e5c70a59955f0ec162d585d"
SRC_URI[sha256sum] = "41388e9d4d1522446fe79d3213196bd9e3b301a336965b9e27ca2788ebd122f3"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
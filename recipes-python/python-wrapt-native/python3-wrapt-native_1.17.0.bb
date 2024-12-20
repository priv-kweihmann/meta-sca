SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dc34cbad60bc961452eb7ade801d25f7"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "90dcc06ea89de96cb58323a7f1e40c9a"
SRC_URI[sha256sum] = "16187aa2317c731170a88ef35e8937ae0f533c402872c1ee5e6d079fcf320801"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
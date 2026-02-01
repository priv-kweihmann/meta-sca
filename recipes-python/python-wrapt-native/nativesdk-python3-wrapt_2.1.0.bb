SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63a78af2900bfcc5ce482f3b8d445898"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "6e07593f709e8e09f7afd3506f6560a7"
SRC_URI[sha256sum] = "757ff1de7e1d8db1839846672aaecf4978af433cc57e808255b83980e9651914"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
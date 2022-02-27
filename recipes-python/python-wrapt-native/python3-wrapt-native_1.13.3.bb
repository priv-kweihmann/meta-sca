SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdfc019b57affbe1d7a32e3d34e83db4"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "50efce974cc8a0d39fd274d74eb0fd1e"
SRC_URI[sha256sum] = "1fea9cd438686e6682271d36f3481a9f3636195578bab9ca3382e2f5f01fc185"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdfc019b57affbe1d7a32e3d34e83db4"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "f45b2b131595dbc5024807f9d009f436"
SRC_URI[sha256sum] = "8323a43bd9c91f62bb7d4be74cc9ff10090e7ef820e27bfe8815c57e68261311"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "A list of Python Standard Libraries"
HOMEPAGE = "https://github.com/jackmaney/python-stdlib-list"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8fe3d55921813400e0e295e623a5c2ae"

PYPI_PACKAGE = "stdlib-list"

SRC_URI[sha256sum] = "95ebd1d73da9333bba03ccc097f5bac05e3aa03e6822a0c0290f87e1047f1857"

inherit pypi
inherit pypi-old
inherit_defer nativesdk

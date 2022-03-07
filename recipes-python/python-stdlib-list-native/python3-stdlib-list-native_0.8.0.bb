SUMMARY = "A list of Python Standard Libraries"
HOMEPAGE = "https://github.com/jackmaney/python-stdlib-list"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8fe3d55921813400e0e295e623a5c2ae"

PYPI_PACKAGE = "stdlib-list"

SRC_URI[sha256sum] = "a1e503719720d71e2ed70ed809b385c60cd3fb555ba7ec046b96360d30b16d9f"

inherit pypi
inherit native

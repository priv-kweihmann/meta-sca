SUMMARY = "A list of Python Standard Libraries"
HOMEPAGE = "https://github.com/jackmaney/python-stdlib-list"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8fe3d55921813400e0e295e623a5c2ae"

PYPI_PACKAGE = "stdlib_list"
UPSTREAM_CHECK_REGEX ?= "/stdlib-list/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[sha256sum] = "b74a7b643a77a12637e907f3f62f0ab9f67300bce4014f6b2d3c8b4c8fd63c66"

inherit pypi
inherit_defer native

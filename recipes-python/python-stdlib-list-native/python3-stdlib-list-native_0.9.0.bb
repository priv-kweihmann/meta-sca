SUMMARY = "A list of Python Standard Libraries"
HOMEPAGE = "https://github.com/jackmaney/python-stdlib-list"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8fe3d55921813400e0e295e623a5c2ae"

PYPI_PACKAGE = "stdlib_list"
UPSTREAM_CHECK_REGEX ?= "/stdlib-list/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[sha256sum] = "98eb66135976c96b4ee3f4c0ef0552ebb5a9977ce3028433db79f4738b02af26"

inherit pypi
inherit native

SUMMARY = "A list of Python Standard Libraries"
HOMEPAGE = "https://github.com/jackmaney/python-stdlib-list"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8fe3d55921813400e0e295e623a5c2ae"

PYPI_PACKAGE = "stdlib_list"
UPSTREAM_CHECK_REGEX ?= "/stdlib-list/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[sha256sum] = "6519c50d645513ed287657bfe856d527f277331540691ddeaf77b25459964a14"

inherit pypi
inherit_defer native

SUMMARY = "A list of Python Standard Libraries"
HOMEPAGE = "https://github.com/jackmaney/python-stdlib-list"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8fe3d55921813400e0e295e623a5c2ae"

PYPI_PACKAGE = "stdlib-list"

SRC_URI[sha256sum] = "517824f27ee89e591d8ae7c1dd9ff34f672eae50ee886ea31bb8816d77535675"

inherit pypi
inherit pypi-old
inherit_defer native

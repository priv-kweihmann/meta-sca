SUMMARY = "Internationalized Domain Names for Python"
HOMEPAGE = "https://github.com/kjd/idna"

LICENSE = "BSD-3-Clause"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

PYPI_PACKAGE = "idna"

SRC_URI[md5sum] = "08ea8e2ce09e522424e872409c221138"
SRC_URI[sha256sum] = "467fbad99067910785144ce333826c71fb0e63a425657295239737f7ecd125f3"

inherit pypi
inherit setuptools3
inherit native

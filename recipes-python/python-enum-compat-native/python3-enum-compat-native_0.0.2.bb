SUMMARY = "enum/enum34 compatibility package"
DESCRIPTION = "This is a virtual package, its whole purpose is to install enum34 on Python older than 3.4. On Python 3.4+ it’s a no-op."
HOMEPAGE = "https://github.com/jstasiak/enum-compat"
LICENSE = "MIT"
## This package doesn't have an explicit license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "enum-compat"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "3002940b6620837d0fbc86ec72509be3"
SRC_URI[sha256sum] = "939ceff18186a5762ae4db9fa7bfe017edbd03b66526b798dd8245394c8a4192"

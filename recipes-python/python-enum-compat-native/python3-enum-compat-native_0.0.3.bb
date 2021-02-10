SUMMARY = "enum/enum34 compatibility package"
DESCRIPTION = "This is a virtual package, its whole purpose is to install enum34 on Python older than 3.4. On Python 3.4+ it’s a no-op."
HOMEPAGE = "https://github.com/jstasiak/enum-compat"

LICENSE = "MIT"
## This package doesn't have an explicit license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

PYPI_PACKAGE = "enum-compat"

SRC_URI[md5sum] = "74c19a80356825e5351aba8c4c1b00e6"
SRC_URI[sha256sum] = "3677daabed56a6f724451d585662253d8fb4e5569845aafa8bb0da36b1a8751e"

inherit pypi
inherit setuptools3
inherit native

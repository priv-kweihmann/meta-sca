SUMMARY = "A Flake8 plugin for checking executable permissions and shebangs. "
DESCRIPTION = "A Flake8 plugin for checking executable permissions and shebangs. "
HOMEPAGE = "https://github.com/xuhdev/flake8-executable"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=1ebbd3e34237af26da5dc08a4e440464"

PYPI_PACKAGE = "flake8-executable"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "71d9165c01de067a2a24c32604bbb721"
SRC_URI[sha256sum] = "10f001e615924dd679ca406eeb06a35990138f4af18da863828cba181f7d9dbd"

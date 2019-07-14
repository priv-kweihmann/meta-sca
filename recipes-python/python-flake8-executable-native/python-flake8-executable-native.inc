SUMMARY = "A Flake8 plugin for checking executable permissions and shebangs. "
DESCRIPTION = "A Flake8 plugin for checking executable permissions and shebangs. "
HOMEPAGE = "https://github.com/xuhdev/flake8-executable"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=1ebbd3e34237af26da5dc08a4e440464"

PYPI_PACKAGE = "flake8-executable"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native

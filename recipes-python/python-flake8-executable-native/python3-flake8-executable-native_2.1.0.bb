SUMMARY = "A Flake8 plugin for checking executable permissions and shebangs"
HOMEPAGE = "https://github.com/xuhdev/flake8-executable"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += "${PYTHON_PN}-flake8-native"

PYPI_PACKAGE = "flake8-executable"

SRC_URI[md5sum] = "3b1c83a733eae6e1b19a9ce1739dd191"
SRC_URI[sha256sum] = "6219f1264a7701233ed00957bd4a345a41d62f22749d5202d2c2f74abf55fa44"

inherit pypi
inherit native
inherit setuptools3

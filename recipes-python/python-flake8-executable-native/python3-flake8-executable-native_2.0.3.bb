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

SRC_URI[md5sum] = "781799cea4a37bf89cd7a397f8d2ac8e"
SRC_URI[sha256sum] = "a636ff78b14b63b1245d1c4d509db2f6ea0f2e27a86ee7eb848f3827bef7e16d"

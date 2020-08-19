SUMMARY = "A Flake8 plugin for checking executable permissions and shebangs"
HOMEPAGE = "https://github.com/xuhdev/flake8-executable"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += "${PYTHON_PN}-flake8-native"

PYPI_PACKAGE = "flake8-executable"

SRC_URI[md5sum] = "35f2cef4c37090b428f0e450cefa7908"
SRC_URI[sha256sum] = "0b987166ccaf8655e26e30d10e1e12de6877471cb91fa4cc7c1ce28cc692bd61"

inherit pypi
inherit native
inherit setuptools3

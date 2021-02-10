SUMMARY = "A Flake8 plugin for checking executable permissions and shebangs"
HOMEPAGE = "https://github.com/xuhdev/flake8-executable"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.GPL;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-executable"

SRC_URI[md5sum] = "ed72412b89ac266e4dd09b9c5abc6cd5"
SRC_URI[sha256sum] = "c6230a089ad49dbeef049d8e1e89591d9823f06c829cd9d6b1ca83b4b1d7f54f"

inherit pypi
inherit setuptools3
inherit native

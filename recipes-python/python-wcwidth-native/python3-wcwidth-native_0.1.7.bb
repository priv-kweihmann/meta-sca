SUMMARY = "Python library that measures the width of unicode strings rendered to a terminal"
DESCRIPTION = "Python library that measures the width of unicode strings rendered to a terminal"
HOMEPAGE = "https://github.com/jquast/wcwidth"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=11fba47286258744a6bc6e43530c32a1"

PYPI_PACKAGE = "wcwidth"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "b3b6a0a08f0c8a34d1de8cf44150a4ad"
SRC_URI[sha256sum] = "3df37372226d6e63e1b1e1eda15c594bca98a22d33a23832a90998faa96bc65e"

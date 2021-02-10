SUMMARY = "Python style guide checker"
HOMEPAGE = "https://pep8.readthedocs.io/"

LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://pep8.py;beginline=3;endline=25;md5=f376a6ada75ad85e25be44d4d360f156"

PYPI_PACKAGE = "pep8"

SRC_URI[md5sum] = "603821d06db945c71d811b5a8d78423c"
SRC_URI[sha256sum] = "fe249b52e20498e59e0b5c5256aa52ee99fc295b26ec9eaa85776ffdb9fe6374"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "e89cfe8325778a8c519a6bf63ae3fe83"
SRC_URI[sha256sum] = "02dae883f567f5b70fd3ad3c9eefb95912e78ac90be6c7444b5e2f46bf572c84"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ef9ea9bec729a33fef60ec5ef45edd22"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "b8d0799589abc35db60502b7534a3747"
SRC_URI[sha256sum] = "8ecac5a308793451640594d9ca42ce89b987711e1e4c9312855321ec21f6ccb4"

inherit pypi
inherit setuptools3
inherit native

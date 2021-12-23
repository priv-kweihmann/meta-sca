SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4021af699354173a4f2c1e1039eeffc"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "f2427f42e3e2d3f60ef102a61e43a81b"
SRC_URI[sha256sum] = "2600100ae96ffd082334b378e355550fef8b4a529a6fa4c34f47130905c7426d"

inherit pypi
inherit setuptools3
inherit native

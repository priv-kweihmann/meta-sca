SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=77b3c56f6b4bca98e817b4d46f6b5805"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "06e8d3864ca074b244cd7cd1ba265d9b"
SRC_URI[sha256sum] = "cdfc3d73cb6d3d4dc3c67af84d912e86bf117d30ae25f02fe823382ef99383d2"

inherit pypi
inherit native
inherit setuptools3

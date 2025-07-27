SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ef9ea9bec729a33fef60ec5ef45edd22"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "47a6be41dc5754459f723b5e4d208231"
SRC_URI[sha256sum] = "517e9cf353942723533ae1100ca45dd27fe0785c3ad2765075f5cb1cbce01482"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-difflib \
    nativesdk-python3-io \
    nativesdk-python3-logging \
    nativesdk-python3-numbers \
    nativesdk-python3-pip \
    nativesdk-python3-pprint \
    nativesdk-python3-pytest \
    nativesdk-python3-unittest \
"

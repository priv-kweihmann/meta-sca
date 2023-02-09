SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ef9ea9bec729a33fef60ec5ef45edd22"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "decc67df5b0d5eb0e1d221e95aad115f"
SRC_URI[sha256sum] = "456ce4f393160f27cd6840a5370ecf4a70f1721737f5e67a2af79e6c817804a4"

inherit pypi
inherit setuptools3
inherit native

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

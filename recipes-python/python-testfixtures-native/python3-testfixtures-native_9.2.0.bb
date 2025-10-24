SUMMARY = "a collection of helpers and mock objects"
DESCRIPTION = "testfixtures is a collection of helpers and mock objects that \
               are useful when writing automated tests in Python"
HOMEPAGE = "https://github.com/Simplistix/testfixtures"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ef9ea9bec729a33fef60ec5ef45edd22"

PYPI_PACKAGE = "testfixtures"

SRC_URI[md5sum] = "68d518d074320d90707002acb8637233"
SRC_URI[sha256sum] = "1909e7889073c96adda774a01de6441da1a2cb47ea5c25c8c2fe56d42a7cf0c1"

inherit pypi
inherit setuptools3
inherit_defer native

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

SUMMARY = "ASN.1 types and codecs"
HOMEPAGE = "https://github.com/etingof/pyasn1"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=a14482d15c2249de3b6f0e8a47e021fd"

PYPI_PACKAGE = "pyasn1"

SRC_URI[md5sum] = "dffae4ff9f997a83324b3f33fe62be54"
SRC_URI[sha256sum] = "aef77c9fb94a3ac588e87841208bdec464471d9871bd5050a287cc9a475cd0ba"

inherit pypi
inherit setuptools3
inherit native

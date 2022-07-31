SUMMARY = "simple python ast consumer which searches for common SQL injection attacks"
HOMEPAGE = "https://github.com/uber/py-find-injection"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1d25d70fea8b21087517ef9490406cb9"

DEPENDS += "nativesdk-python3"

SRC_URI = "git://github.com/priv-kweihmann/py-find-injection.git;branch=master;protocol=https"
SRCREV = "31a0b2e45efe228a780e02c249637871c9e17777"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "pyfindinjection"
PIP_INSTALL_PACKAGE = "py_find_injection"
RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"

SUMMARY = "six"
DESCRIPTION = "Python 2 and 3 compatibility library"
HOMEPAGE = "https://github.com/benjaminp/six"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=35cec5bf04dd0820d0a18533ea7c774a"

PV = "1.11.0"

SRC_URI[md5sum] = "d12789f9baf7e9fb2524c0c64f1773f8"
SRC_URI[sha256sum] = "70e8a77beed4562e7f14fe23a786b54f6296e34344c23bc42f07b15018ff98e9"

RDEPENDS_${PN} += "python3-native"
PYPI_PACKAGE = "six"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/six"

BBCLASSEXTEND = "native nativesdk"

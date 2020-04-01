SUMMARY = "A python wrapper for libmagic"
HOMEPAGE = "https://github.com/ahupp/python-magic"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=16a934f165e8c3245f241e77d401bb88"

DEPENDS += "file-native"

PYPI_PACKAGE = "python-magic"

SRC_URI[md5sum] = "e384c95a47218f66c6501cd6dd45ff59"
SRC_URI[sha256sum] = "f3765c0f582d2dfc72c15f3b5a82aecfae9498bd29ca840d72f37d7bd38bfcd5"

inherit pypi
inherit native
inherit setuptools3

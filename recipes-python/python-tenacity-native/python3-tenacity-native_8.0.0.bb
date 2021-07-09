SUMMARY = "general-purpose retrying library"
HOMEPAGE = "https://github.com/jd/tenacity"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS += "\
             python3-setuptools-scm-native \
             python3-six-native \
            "

PYPI_PACKAGE = "tenacity"

SRC_URI[md5sum] = "42c1dc34e91612d7f6ce4baf02336c21"
SRC_URI[sha256sum] = "6011fc69be55e0e20a9ceccdd8a7d969e42f892a81ea3a007de56e764d3551dd"

inherit pypi
inherit setuptools3
inherit native

SUMMARY = "general-purpose retrying library"
HOMEPAGE = "https://github.com/jd/tenacity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS += "\
             python3-setuptools-scm-native \
             python3-six-native \
            "

PYPI_PACKAGE = "tenacity"

SRC_URI[md5sum] = "9e972821060ab4af78abd621b58cd9a2"
SRC_URI[sha256sum] = "43af037822bd0029025877f3b2d97cc4d7bb0c2991000a3d59d71517c5c969e0"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-six"

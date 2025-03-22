SUMMARY = "Debian package related modules"
HOMEPAGE = "https://salsa.debian.org/python-debian-team/python-debian"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c"

DEPENDS += "\
    python3-chardet-native \
    python3-setuptools-scm-native \
    python3-six-native \
"

PYPI_PACKAGE = "python-debian"

SRC_URI[md5sum] = "d1a4530365cc306b63aae9f34f40e88b"
SRC_URI[sha256sum] = "3ada9b83a3d671b58081782c0969cffa0102f6ce433fbbc7cf21275b8b5cc771"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-six \
"

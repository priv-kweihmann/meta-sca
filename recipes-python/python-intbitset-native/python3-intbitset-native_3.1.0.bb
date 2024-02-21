SUMMARY = "C-based extension implementing fast integer bit sets"
HOMEPAGE = "http://github.com/inveniosoftware/intbitset/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
    python3-cython-native \
    python3-six-native \
"

PYPI_PACKAGE = "intbitset"

SRC_URI[md5sum] = "2ad2ac9ebff923a33574188216c8e1ee"
SRC_URI[sha256sum] = "6e83c5ba7fda2520aa8565428bbaf842deb7293d665f3cd8281cb39254d2ff71"

inherit pypi
inherit setuptools3
inherit native

do_compile:prepend() {
    # enforce generation of pyx objects matching the python code version
    rm -rfv src/intbitset.c
    cython3 intbitset/intbitset.pyx
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-cython \
    nativesdk-python3-six \
"

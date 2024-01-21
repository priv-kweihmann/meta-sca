SUMMARY = "C-based extension implementing fast integer bit sets"
HOMEPAGE = "http://github.com/inveniosoftware/intbitset/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
    nativesdk-python3-cython \
    nativesdk-python3-six \
"

PYPI_PACKAGE = "intbitset"

SRC_URI[md5sum] = "319ed288a11c9764571d93d679f4fa6b"
SRC_URI[sha256sum] = "a300b2d5a4989857ff1d0c3971624766a89a751e315aa080c07865031ae637a7"

inherit pypi
inherit setuptools3
inherit nativesdk

do_compile:prepend() {
    # enforce generation of pyx objects matching the python code version
    rm -rfv src/intbitset.c
    cython3 intbitset/intbitset.pyx
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-cython \
    nativesdk-python3-six \
"

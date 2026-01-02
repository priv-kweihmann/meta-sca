SUMMARY = "C-based extension implementing fast integer bit sets"
HOMEPAGE = "http://github.com/inveniosoftware/intbitset/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

DEPENDS += "\
    nativesdk-python3-six \
    python3-cython-native \
"

PYPI_PACKAGE = "intbitset"

SRC_URI[md5sum] = "d07f5c457e188d1db03d75302c10807f"
SRC_URI[sha256sum] = "73145ff05e4227c76585ff8550638b6a083cd130010b781045d81af58f7b6920"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

do_compile:prepend() {
    # enforce generation of pyx objects matching the python code version
    rm -rfv src/intbitset.c
    cython3 intbitset/intbitset.pyx
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-cython \
    nativesdk-python3-six \
"

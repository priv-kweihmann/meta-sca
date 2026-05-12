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

SRC_URI[md5sum] = "4f7ffb83c9888e0390ca44c17ed0a93a"
SRC_URI[sha256sum] = "f82fafe0bcb4fe7a010d942099b5a84d721d37c897538ed632f788962c1411f8"

inherit pypi
inherit setuptools3
inherit_defer native

do_compile:prepend() {
    # enforce generation of pyx objects matching the python code version
    rm -rfv src/intbitset.c
    cython3 intbitset/intbitset.pyx
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-cython \
    nativesdk-python3-six \
"

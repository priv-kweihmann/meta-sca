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

SRC_URI[md5sum] = "a625dceef38d3d7d803b45ac5c24d843"
SRC_URI[sha256sum] = "c141edaa1c17b91c2987537e269d955ab6bdc3966af3deb6e1e0d20edbd09dd2"

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

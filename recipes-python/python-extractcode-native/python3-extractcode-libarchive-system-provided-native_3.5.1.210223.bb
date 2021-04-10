SUMMARY = "provide a system package provided libarchive shared library"
HOMEPAGE = "https://github.com/nexB/scancode-plugins"

LICENSE = "Apache-2.0 & BSD-2-Clause"
LIC_FILES_CHKSUM = "\
    file://apache-2.0.LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.txt;md5=214ab1f3959dbadca68fce0a2e9dcf7f \
"

DEPENDS += "\
    libarchive-native \
"

SRC_URI_append = " file://0001-override-paths-by-env-var.patch"

PYPI_PACKAGE = "extractcode_libarchive_system_provided"

SRC_URI[md5sum] = "c750938fe4e1e082af891e2a285bf4f1"
SRC_URI[sha256sum] = "3d66a0bade4b7c813af745bdb0bbbb4f506d9e889a0256f17b023134bcbe0fef"

inherit pypi
inherit setuptools3
inherit native

UPSTREAM_CHECK_URI = "https://pypi.org/project/extractcode-libarchive-system-provided/"
UPSTREAM_CHECK_REGEX = "/extractcode-libarchive-system-provided/(?P<pver>(\d+[\.\-_]*)+)/"

do_install_append() {
    # forcefully replace version when using older setuptools
    find ${D} -type f -exec sed -i "s#0\.0\.0#${PV}#g" {} \;
}

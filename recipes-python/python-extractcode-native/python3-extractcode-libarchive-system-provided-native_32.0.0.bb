SUMMARY = "provide a system package provided libarchive shared library"
HOMEPAGE = "https://github.com/nexB/scancode-plugins"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 & BSD-2-Clause"
LIC_FILES_CHKSUM = "\
    file://apache-2.0.LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.txt;md5=214ab1f3959dbadca68fce0a2e9dcf7f \
"

DEPENDS += "\
    libarchive-native \
"

PYPI_PACKAGE = "extractcode_libarchive_system_provided"

SRC_URI[md5sum] = "591d2827a2fde6993bfb6276847c898e"
SRC_URI[sha256sum] = "d789f00c03e33a1084487d36ccad4a36759cba191c79ffe1e87cf2e7665ee771"

inherit pypi
inherit setuptools3
inherit_defer native

UPSTREAM_CHECK_URI = "https://pypi.org/project/extractcode-libarchive-system-provided/"
UPSTREAM_CHECK_REGEX = "/extractcode-libarchive-system-provided/(?P<pver>(\d+[\.\-_]*)+)/"

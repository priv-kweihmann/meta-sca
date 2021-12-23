SUMMARY = "plugin to provide system package provided sevenzip binary"
HOMEPAGE = "https://github.com/nexB/extractcode"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 & LGPL-2.1 & unRAR & BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://apache-2.0.LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.txt;md5=b88ed37631527bdf35bcf5cb2dac553f \
"

DEPENDS += "\
    p7zip-native \
"

PYPI_PACKAGE = "extractcode_7z_system_provided"

SRC_URI[md5sum] = "e1b4f42e05c5a46941dbe390e66fc01b"
SRC_URI[sha256sum] = "e26a8ca74737251a0380068ff5c2c5c94d65eae557281350104bd7198e1b6385"

inherit pypi
inherit setuptools3
inherit native

UPSTREAM_CHECK_URI = "https://pypi.org/project/extractcode-7z-system-provided/"
UPSTREAM_CHECK_REGEX = "/extractcode-7z-system-provided/(?P<pver>(\d+[\.\-_]*)+)/"

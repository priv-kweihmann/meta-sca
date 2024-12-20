SUMMARY = "plugin to provide system package provided sevenzip binary"
HOMEPAGE = "https://github.com/nexB/extractcode"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 & LGPL-2.1-only & unRAR & BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://apache-2.0.LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.txt;md5=b88ed37631527bdf35bcf5cb2dac553f \
"

DEPENDS += "\
    p7zip-native \
"

PYPI_PACKAGE = "extractcode-7z-system-provided"

SRC_URI[md5sum] = "67375aacdaa2886b795ede956ee1e104"
SRC_URI[sha256sum] = "fdb36a946bf7f5cd33732503fa975bc94f0102a11b3b6585cb1181b1f2d487de"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

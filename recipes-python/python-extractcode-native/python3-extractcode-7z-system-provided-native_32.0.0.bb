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

PYPI_PACKAGE = "extractcode_7z_system_provided"

SRC_URI[md5sum] = "5b61ae1e656a7cae5a84c53ba29097f9"
SRC_URI[sha256sum] = "1cbcfba7263e56b548764475b12a0da717181a04ea358d4a8c1e3475917a8acd"

inherit pypi
inherit setuptools3
inherit_defer native

UPSTREAM_CHECK_URI = "https://pypi.org/project/extractcode-7z-system-provided/"
UPSTREAM_CHECK_REGEX = "/extractcode-7z-system-provided/(?P<pver>(\d+[\.\-_]*)+)/"

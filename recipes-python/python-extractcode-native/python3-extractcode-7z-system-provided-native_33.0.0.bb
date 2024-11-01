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

SRC_URI[md5sum] = "1a581e121f8ea972f8d450805d986144"
SRC_URI[sha256sum] = "35a438a044a34ddd045037f48dd6ffd5a3e759c6bf5dda5d66de2503fab3e02c"

inherit pypi
inherit setuptools3
inherit_defer native

UPSTREAM_CHECK_URI = "https://pypi.org/project/extractcode-7z-system-provided/"
UPSTREAM_CHECK_REGEX = "/extractcode-7z-system-provided/(?P<pver>(\d+[\.\-_]*)+)/"

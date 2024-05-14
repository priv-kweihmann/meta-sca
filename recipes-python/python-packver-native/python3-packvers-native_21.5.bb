SUMMARY = "Core utilities for Python packages. Fork to support LegacyVersion"
HOMEPAGE = "https://github.com/nexB/packvers"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 | BSD-2-Clause"
LIC_FILES_CHKSUM = "\
    file://LICENSE;md5=faadaedca9251a90b205c9167578ce91 \
    file://LICENSE.APACHE;md5=2ee41112a44fe7014dce33e26468ba93 \
    file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8 \
"

DEPENDS += "python3-pyparsing-native"

PYPI_PACKAGE = "packvers"

SRC_URI[sha256sum] = "2d2758fc09d2c325414354b8478d649f878b52c38598517fba51c8623526ca79"

inherit pypi
inherit setuptools3
inherit_defer native

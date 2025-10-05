SUMMARY = "alternative parser for bitbake recipes"
HOMEPAGE = "https://github.com/priv-kweihmann/oelint-parser"

DEPENDS += "\
    python3-deprecated-native \
    python3-regex-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=297280a76099d6470990f30683c459d4"

PYPI_PACKAGE = "oelint-parser"

SRC_URI[sha256sum] = "24161078fc3b5697f7790133f5d3aa698305b1ab7e95948b2580d811fb104130"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-deprecated \
    nativesdk-python3-regex \
"

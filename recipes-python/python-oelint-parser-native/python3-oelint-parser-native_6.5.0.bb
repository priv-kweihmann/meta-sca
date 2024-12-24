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

SRC_URI[sha256sum] = "b5033a81fa84116be6432adaa5fc84f638df67b7cd11523c909e07bbc9da6fe4"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-deprecated \
    nativesdk-python3-regex \
"

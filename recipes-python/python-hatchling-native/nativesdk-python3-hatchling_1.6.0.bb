# This is a slightly modified recipe taken from
# https://github.com/openembedded/meta-openembedded
# licensed under MIT
# SPDX-License-Identifier: MIT
SUMMARY = "The extensible, standards compliant build backend used by Hatch"
HOMEPAGE = "https://hatch.pypa.io/latest/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbe2fd33fc9297692812fc94b7d27fd9"

DEPENDS += "\
    nativesdk-python3-editables \
    nativesdk-python3-packaging \
    nativesdk-python3-pathspec \
    nativesdk-python3-pluggy \
    python3-tomli-native \
"
DEPENDS:remove = "nativesdk-python3-hatchling"

SRC_URI[sha256sum] = "bd6e8505de511ac4217ff50927f6d1845494608e401e63a62b830c31fb613544"

inherit pypi
inherit python_hatchling
inherit nativesdk

PYPI_PACKAGE = "hatchling"
PEP517_BUILD_API = "hatchling.ouroboros"

do_compile:prepend() {
    export PYTHONPATH=src
}

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-hatchling"

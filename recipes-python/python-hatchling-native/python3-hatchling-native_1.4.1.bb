# This is a slightly modified recipe taken from
# https://github.com/openembedded/meta-openembedded
# licensed under MIT
# SPDX-License-Identifier: MIT
SUMMARY = "The extensible, standards compliant build backend used by Hatch"
HOMEPAGE = "https://hatch.pypa.io/latest/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbe2fd33fc9297692812fc94b7d27fd9"

DEPENDS += "\
    python3-editables-native \
    python3-packaging-native \
    python3-pathspec-native \
    python3-pluggy-native \
    python3-tomli-native \
"
DEPENDS:remove = "python3-hatchling-native"

SRC_URI[sha256sum] = "13461b42876ade4f75ee5d2a2c656b288ca0aab7f048ef66657ef166996b2118"

inherit pypi python_hatchling native

PYPI_PACKAGE = "hatchling"
PEP517_BUILD_API = "hatchling.ouroboros"

do_compile:prepend() {
    export PYTHONPATH=src
}


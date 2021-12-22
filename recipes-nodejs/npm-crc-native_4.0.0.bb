SUMMARY = "NPM: crc"
DESCRIPTION = "Module for calculating Cyclic Redundancy Check (CRC) for Node.js and the Browser."
HOMEPAGE = "https://github.com/alexgorbatchev/node-crc"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96fda0720658f13fcd8fe9972ae08a77"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/crc/-/crc-4.0.0.tgz"
SRC_URI[md5sum] = "f8c45e25971537a89bad0a8d8f055b76"
SRC_URI[sha256sum] = "dbbe8548354cd59888a8576294f10941053f7ad1b81c4e694978382c0d81a11e"

NPM_PKGNAME = "crc"

inherit npmhelper
inherit native

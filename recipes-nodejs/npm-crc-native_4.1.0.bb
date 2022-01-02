SUMMARY = "NPM: crc"
DESCRIPTION = "Module for calculating Cyclic Redundancy Check (CRC) for Node.js and the Browser."
HOMEPAGE = "https://github.com/alexgorbatchev/node-crc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96fda0720658f13fcd8fe9972ae08a77"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/crc/-/crc-4.1.0.tgz"
SRC_URI[md5sum] = "224aae06874b47ac224ce4a3508cbdab"
SRC_URI[sha256sum] = "03465353dbd5637d937f04878a6bba52871562ef81033e86ccf5616be0dced98"

NPM_PKGNAME = "crc"

inherit npmhelper
inherit native

SUMMARY = "NPM: crc"
DESCRIPTION = "Module for calculating Cyclic Redundancy Check (CRC) for Node.js and the Browser."
HOMEPAGE = "https://github.com/alexgorbatchev/node-crc"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96fda0720658f13fcd8fe9972ae08a77"

DEPENDS = "npm-buffer-native"

SRC_URI = "https://registry.npmjs.org/crc/-/crc-3.8.0.tgz"
SRC_URI[md5sum] = "012c3c092ef65c7d1c4a0636795e329b"
SRC_URI[sha256sum] = "153ff7ab6c15a5ef7e0e19c2bea396172aefb51d7c9e07d0d4814a7c099715f5"

NPM_PKGNAME = "crc"

inherit npmhelper
inherit native

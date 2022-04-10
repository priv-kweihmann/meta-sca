SUMMARY = "NPM: crc"
DESCRIPTION = "Module for calculating Cyclic Redundancy Check (CRC) for Node.js and the Browser."
HOMEPAGE = "https://github.com/alexgorbatchev/node-crc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96fda0720658f13fcd8fe9972ae08a77"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/crc/-/crc-4.1.1.tgz"
SRC_URI[md5sum] = "41197e917db26b42fad70b4611bec9d5"
SRC_URI[sha256sum] = "93a1cea6181c92711ba51238d09191bf5144d0926208b57d3ca8882b471c4a9b"

NPM_PKGNAME = "crc"

inherit npmhelper
inherit native

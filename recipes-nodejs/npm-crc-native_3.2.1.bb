SUMMARY = "NPM: crc"
DESCRIPTION = "Various CRC JavaScript implementations"
HOMEPAGE = "https://github.com/alexgorbatchev/node-crc"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96fda0720658f13fcd8fe9972ae08a77"

SRC_URI = "https://registry.npmjs.org/crc/-/crc-3.2.1.tgz"
SRC_URI[md5sum] = "c92619b4ba08176d5ee1ccddf89d4513"
SRC_URI[sha256sum] = "1c64010f13c5b3ac933856e4d1c2bd84940c00bea007572dc510c6a13b7a44dd"

NPM_PKGNAME = "crc"

inherit npmhelper
inherit native

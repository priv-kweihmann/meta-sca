SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.1.6.tgz"
SRC_URI[md5sum] = "2b2f7201f229477f6728b8f30dd4fe39"
SRC_URI[sha256sum] = "2d9307063fae2ea3412f91e9d8f9a9cb57b73ca7383e522275c6a90a3345665c"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

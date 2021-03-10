SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.2.3.tgz"
SRC_URI[md5sum] = "20457cced9daac1405d32f5f679cd044"
SRC_URI[sha256sum] = "54abf6dc08ec311c8c0a0641aef53cd93efff7a3a9c1733e63c61bd6ba697305"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

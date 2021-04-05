SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.2.6.tgz"
SRC_URI[md5sum] = "903ec964215a4b8708bdc292b0bede91"
SRC_URI[sha256sum] = "8dfc6d445e32b0014f03c302f87c160fd3ac9c2c63d3d308b33c59a7f3939e8c"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

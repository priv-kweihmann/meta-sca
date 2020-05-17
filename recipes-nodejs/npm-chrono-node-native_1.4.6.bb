SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

DEPENDS = "npm-dayjs-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-1.4.6.tgz"
SRC_URI[md5sum] = "f11dbbf74a67d09ce37f66fdebaac677"
SRC_URI[sha256sum] = "796eb99d1d0465e46f95b1c4e136a741fbbf280ddb977e55e765d0653bc4bcd9"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.1.8.tgz"
SRC_URI[md5sum] = "6d765c95d4aabf7d730f5ff4a4bc7d0d"
SRC_URI[sha256sum] = "8a04578bb30849a2d406ebe547459f83d5c5f3a60a89c9f69bf24dd42c927d38"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

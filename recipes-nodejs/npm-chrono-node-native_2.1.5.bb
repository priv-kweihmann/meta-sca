SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.1.5.tgz"
SRC_URI[md5sum] = "64818a0ce2885f94018ef5c901d67506"
SRC_URI[sha256sum] = "5cfe2a684c92cd4f2c3960dfd8e63cb597b0a18e500de91d6481fe3354f97002"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.1.10.tgz"
SRC_URI[md5sum] = "41a9bf07c47278ef40197385be813eed"
SRC_URI[sha256sum] = "928829821465fb39d054d30bd2bc4df55d780c491a11de854d5009177d183e33"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.1.9.tgz"
SRC_URI[md5sum] = "c38cd8fde20b83446bb8d69da91b3b19"
SRC_URI[sha256sum] = "3c844e158d8a4b75ad24cb12768d7abffc1744667117d1e3aae07ad7d5c38cb7"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

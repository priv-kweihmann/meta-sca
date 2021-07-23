SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.3.1.tgz"
SRC_URI[md5sum] = "c9acfc183b06e3513785d7bc8718840c"
SRC_URI[sha256sum] = "e536888d67d70b807fb9134c265059069984aacdbdbd5cb897978e98ae4e6b42"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

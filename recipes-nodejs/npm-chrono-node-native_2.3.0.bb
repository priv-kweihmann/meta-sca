SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.3.0.tgz"
SRC_URI[md5sum] = "ad9e57f0e9cf5c77c6eed3ac57e294e0"
SRC_URI[sha256sum] = "a47dfa2c9533004e7eb6d2fe3cc71ee74ba5b02fcedc8cd61ab51e206361b7c4"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

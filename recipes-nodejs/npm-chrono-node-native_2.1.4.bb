SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.1.4.tgz"
SRC_URI[md5sum] = "a59df909e1bbbd5b24e80871dd232f5b"
SRC_URI[sha256sum] = "c91ba2366709dd91a7dca82178741c969eaf67bd3d9c548dbcb5b04eb7c5ec52"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

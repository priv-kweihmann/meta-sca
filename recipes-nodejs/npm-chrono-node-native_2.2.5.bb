SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.2.5.tgz"
SRC_URI[md5sum] = "bb309cd9f415aa61b0668a05320de8a5"
SRC_URI[sha256sum] = "072fe0c84f6e80ab3b1d73df3165e93a47f0bd392f4b2b7d99f8d65fc29ba2bd"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

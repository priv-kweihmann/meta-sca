SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.1.7.tgz"
SRC_URI[md5sum] = "01674f2f255918a789a74624c8d01fb0"
SRC_URI[sha256sum] = "4213a53ba5ca96e25c660e9c946a6bc73a8512d2a14935d7731536dea299c432"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

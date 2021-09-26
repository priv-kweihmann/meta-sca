SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.3.2.tgz"
SRC_URI[md5sum] = "33b47a9482c3ab410304ca6683bd51bb"
SRC_URI[sha256sum] = "37df1190f079f677a38bfae830a5be931e02b93b43607291c06a98d75fa7dbec"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.3.8.tgz"
SRC_URI[md5sum] = "e03f6ac74b066114233145c38d0f6851"
SRC_URI[sha256sum] = "c86a9f22575fb005e4cae0391f89f7091775bc76f10e6673c7b0c8ef5bd68c6c"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

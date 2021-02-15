SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.2.1.tgz"
SRC_URI[md5sum] = "81c84636daa9cde9df82c9a712f24405"
SRC_URI[sha256sum] = "d08c9298961d9450100e0a93ac12443db6319b73597c70e47aefa7e13a472d3f"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native

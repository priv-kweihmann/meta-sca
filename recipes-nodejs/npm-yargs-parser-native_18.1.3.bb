SUMMARY = "NPM: yargs-parser"
DESCRIPTION = "the mighty option parser used by yargs"
HOMEPAGE = "https://github.com/yargs/yargs-parser#readme"

DEPENDS = "npm-camelcase-native npm-decamelize-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35"

SRC_URI = "https://registry.npmjs.org/yargs-parser/-/yargs-parser-18.1.3.tgz"
SRC_URI[md5sum] = "4d5c278a0e6c1d7a11f1ae5079f57602"
SRC_URI[sha256sum] = "0c9135ee2330fd9cdc19fed11b8d9a7b292f5dd8ddf40c13b051340693ebbe58"

NPM_PKGNAME = "yargs-parser"

inherit npmhelper
inherit native

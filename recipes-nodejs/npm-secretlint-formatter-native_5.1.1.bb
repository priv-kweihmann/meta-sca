SUMMARY = "NPM: @secretlint/formatter"
DESCRIPTION = "A formatter collection for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/formatter/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-chalk-native \
           npm-debug-native \
           npm-pluralize-native \
           npm-secretlint-types-native \
           npm-strip-ansi-native \
           npm-table-native \
           npm-terminal-link-native \
           npm-textlint-linter-formatter-native \
           npm-textlint-types-native \
           npm-try-resolve-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-5.1.1.tgz"
SRC_URI[md5sum] = "325eb536d26d6cb63ea999733f09b2a0"
SRC_URI[sha256sum] = "e2196f4059e63c9ffa43e5741bc4508b3939001f497032955a55ff7bd9ff27c6"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit native

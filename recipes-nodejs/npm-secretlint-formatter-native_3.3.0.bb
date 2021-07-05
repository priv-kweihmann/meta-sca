SUMMARY = "NPM: @secretlint/formatter"
DESCRIPTION = "A formatter collection for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/formatter/"

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

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-3.3.0.tgz"
SRC_URI[md5sum] = "f5aa492f8fe60dbbf76594178c5b29d6"
SRC_URI[sha256sum] = "ccc3b5fde5d0709846b07a53ae554d7dc3bb7fdcbcbac6d66a1793e82949c107"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit native

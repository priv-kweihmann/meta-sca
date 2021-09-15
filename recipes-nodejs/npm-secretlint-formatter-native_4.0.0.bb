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

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-4.0.0.tgz"
SRC_URI[md5sum] = "f83e5ee1e50056e9cd88e10210f4d3c3"
SRC_URI[sha256sum] = "85a7952e56b61d85ccbc4b4e6e9c38e18b689b8af913eed148af36beec53fc05"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit native

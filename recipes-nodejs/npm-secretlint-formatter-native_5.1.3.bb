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

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-5.1.3.tgz"
SRC_URI[md5sum] = "fa0b6a5125ef14cfbc51db458da95cbe"
SRC_URI[sha256sum] = "92d48b8907a30a406e516bacf57019466db0cb82a4d92cbb76e4447711821207"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit native

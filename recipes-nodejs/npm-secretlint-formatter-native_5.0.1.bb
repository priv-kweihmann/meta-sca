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

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-5.0.1.tgz"
SRC_URI[md5sum] = "ddab1be21ac1311408cab4530d90c70c"
SRC_URI[sha256sum] = "cce1168e455bf1cc6dbd918f8b763191a5bc9cb2ea366771016fde3068027f21"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit native

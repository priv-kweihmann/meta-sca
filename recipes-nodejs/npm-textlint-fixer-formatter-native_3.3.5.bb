SUMMARY = "NPM: @textlint/fixer-formatter"
DESCRIPTION = "textlint output formatter for fixer"
HOMEPAGE = "https://github.com/textlint/textlint#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3452a94937d21f84bc38880f636e3ba"

DEPENDS = "npm-chalk-native \
           npm-debug-native \
           npm-diff-native \
           npm-is-file-native \
           npm-string-width-native \
           npm-strip-ansi-native \
           npm-text-table-native \
           npm-textlint-module-interop-native \
           npm-textlint-types-native \
           npm-try-resolve-native"

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-3.3.5.tgz"
SRC_URI[md5sum] = "902d7f0abec4180bac91d4ed5772c647"
SRC_URI[sha256sum] = "5deae07399c624b915a5e31abd7db4d61592ea2807d9b2f37506855eb11711e3"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit native

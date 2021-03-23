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

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-3.3.4.tgz"
SRC_URI[md5sum] = "585c51307b610e5ff95acb692987a792"
SRC_URI[sha256sum] = "8e915b5d712cfb1aba8fdb9ab26a397fb2d4e81fafed1b41d5b07f88c1984d59"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit native

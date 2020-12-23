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

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-3.2.6.tgz"
SRC_URI[md5sum] = "d422f56e65e70fb68ad92d4113668a72"
SRC_URI[sha256sum] = "e78cdc83603553ffc3ee6deb464664b4648c3bdee04eb3cae3c0872003c18a72"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit native

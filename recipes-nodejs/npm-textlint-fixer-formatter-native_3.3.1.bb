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

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-3.3.1.tgz"
SRC_URI[md5sum] = "422b26130e0f8171cbb78af524ba8582"
SRC_URI[sha256sum] = "bd7bfc9393217c3c626605b35e1b4a3c20b576742dfda0d14d53e75ebcce6e57"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit native

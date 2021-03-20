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

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-3.3.3.tgz"
SRC_URI[md5sum] = "8760fd7ea64610fc766c2f5539e782c9"
SRC_URI[sha256sum] = "99d1dfa43ee1e8fd7d71ba0affde8cc5b7e75fd6294c8878e5a5609b7424bb7b"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit native

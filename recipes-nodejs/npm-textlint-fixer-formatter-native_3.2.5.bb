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

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-3.2.5.tgz"
SRC_URI[md5sum] = "4b2d00e324a8764472f72baecd294e70"
SRC_URI[sha256sum] = "62a15731b5163728013ef1fe467ab7f6119744e9b4c3ea9e10a5a5d2715c172e"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit native

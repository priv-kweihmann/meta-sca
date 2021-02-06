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

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-3.3.2.tgz"
SRC_URI[md5sum] = "b688eca924d9b4966c061d8003956956"
SRC_URI[sha256sum] = "95ae59acb2e1f103201a8b287dc88516d3b9010156c8a0fc67d45f27735dbfe1"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit native

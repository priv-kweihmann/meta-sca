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

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-12.0.0.tgz"
SRC_URI[md5sum] = "ab0583701e6025103184df0b8be235ec"
SRC_URI[sha256sum] = "c6ac27afb1c41f39f5b13482531f03ec71070b047c5d318948e98c263a4491ab"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit native

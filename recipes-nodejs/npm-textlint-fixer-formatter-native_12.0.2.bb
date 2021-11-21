SUMMARY = "NPM: @textlint/fixer-formatter"
DESCRIPTION = "textlint output formatter for fixer"
HOMEPAGE = "https://github.com/textlint/textlint#readme"

DEFAULT_PREFERENCE = "-1"
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

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-12.0.2.tgz"
SRC_URI[md5sum] = "636ebcacdfa97651b47e5a65e24f9a2f"
SRC_URI[sha256sum] = "773480a6219028b45417630ad429397344381893805f3a31b95aac4dc1e535f2"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit native

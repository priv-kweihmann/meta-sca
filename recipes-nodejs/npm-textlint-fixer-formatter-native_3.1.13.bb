SUMMARY = "NPM: @textlint/fixer-formatter"
DESCRIPTION = "textlint output formatter for fixer"
HOMEPAGE = "https://github.com/textlint/textlint#readme"

DEPENDS = "npm-chalk-native npm-debug-native npm-diff-native npm-is-file-native npm-string-width-native npm-strip-ansi-native npm-text-table-native npm-textlint-module-interop-native npm-textlint-types-native npm-try-resolve-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3452a94937d21f84bc38880f636e3ba"

SRC_URI = "https://registry.npmjs.org/@textlint/fixer-formatter/-/fixer-formatter-3.1.13.tgz"
SRC_URI[md5sum] = "56b4c232278e70e3e01e247b265765c8"
SRC_URI[sha256sum] = "1c26ae234cef033f643dbb13e30ff1c2b7dcc4d7b14b9909d48adfc2bcc169dc"

NPM_PKGNAME = "@textlint/fixer-formatter"

inherit npmhelper
inherit native

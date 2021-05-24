SUMMARY = "NPM: @textlint/linter-formatter"
DESCRIPTION = "textlint output formatter"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/linter-formatter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6b49acb5580df945e291fca134d1b02a"

DEPENDS = "npm-azu-format-text-native \
           npm-azu-style-format-native \
           npm-chalk-native \
           npm-debug-native \
           npm-is-file-native \
           npm-js-yaml-native \
           npm-optionator-native \
           npm-pluralize-native \
           npm-string-width-native \
           npm-strip-ansi-native \
           npm-table-native \
           npm-text-table-native \
           npm-textlint-module-interop-native \
           npm-textlint-types-native \
           npm-try-resolve-native \
           npm-xml-escape-native"

SRC_URI = "https://registry.npmjs.org/@textlint/linter-formatter/-/linter-formatter-12.0.0.tgz"
SRC_URI[md5sum] = "29bd2c96c121ef0c7220a188f8fb4a88"
SRC_URI[sha256sum] = "31ff3ba32ca4fa572f6ddf4252a6b3988502bd9f0d304701328beab9dd8bbf7d"

NPM_PKGNAME = "@textlint/linter-formatter"

inherit npmhelper
inherit native

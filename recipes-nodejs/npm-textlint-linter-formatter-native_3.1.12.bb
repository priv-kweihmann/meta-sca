SUMMARY = "NPM: @textlint/linter-formatter"
DESCRIPTION = "textlint output formatter"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/linter-formatter"

DEPENDS = "npm-azu-format-text-native npm-azu-style-format-native npm-chalk-native npm-concat-stream-native npm-debug-native npm-is-file-native npm-js-yaml-native npm-optionator-native npm-pluralize-native npm-string-width-native npm-string.prototype.padstart-native npm-strip-ansi-native npm-table-native npm-text-table-native npm-textlint-module-interop-native npm-textlint-types-native npm-try-resolve-native npm-xml-escape-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6b49acb5580df945e291fca134d1b02a"

SRC_URI = "https://registry.npmjs.org/@textlint/linter-formatter/-/linter-formatter-3.1.12.tgz"
SRC_URI[md5sum] = "5572d581e4dce23d638f9c433ed8e36b"
SRC_URI[sha256sum] = "248e8c8220e20b3f1243698f68110dc413e7f569b4e7376df5952b063389c802"

NPM_PKGNAME = "@textlint/linter-formatter"

inherit npmhelper
inherit native

SUMMARY = "NPM: @textlint/linter-formatter"
DESCRIPTION = "textlint output formatter"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/linter-formatter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6b49acb5580df945e291fca134d1b02a"

DEPENDS = "npm-azu-format-text-native \
           npm-azu-style-format-native \
           npm-chalk-native \
           npm-concat-stream-native \
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

SRC_URI = "https://registry.npmjs.org/@textlint/linter-formatter/-/linter-formatter-3.3.5.tgz"
SRC_URI[md5sum] = "fa41ff51f080ee51f4998742cd445589"
SRC_URI[sha256sum] = "1358c23df632e49c3d784b2c558d85f912b20c07ecd9d7d32d543c28d632a792"

NPM_PKGNAME = "@textlint/linter-formatter"

inherit npmhelper
inherit native

SUMMARY = "NPM: @textlint/linter-formatter"
DESCRIPTION = "textlint output formatter"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/linter-formatter"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/@textlint/linter-formatter/-/linter-formatter-12.1.1.tgz"
SRC_URI[md5sum] = "6d0fa7267538e859798a8ef695d02ffd"
SRC_URI[sha256sum] = "ebd761db28cab31e29ab877b37b52e1243a4d7d5b8b252496eb8756f7b270b52"

NPM_PKGNAME = "@textlint/linter-formatter"

inherit npmhelper
inherit native

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

SRC_URI = "https://registry.npmjs.org/@textlint/linter-formatter/-/linter-formatter-12.1.0.tgz"
SRC_URI[md5sum] = "4cfa4e0575ba5ce4f35ae3fcf4c563f8"
SRC_URI[sha256sum] = "c684922cc622afbbda63113a8ba04af3d7030be98d4dabf7b1ca9bc97ba0339b"

NPM_PKGNAME = "@textlint/linter-formatter"

inherit npmhelper
inherit native

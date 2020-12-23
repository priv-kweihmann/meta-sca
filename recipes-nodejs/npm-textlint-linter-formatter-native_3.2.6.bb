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

SRC_URI = "https://registry.npmjs.org/@textlint/linter-formatter/-/linter-formatter-3.2.6.tgz"
SRC_URI[md5sum] = "9661779a60e42545a5754c1e97a95684"
SRC_URI[sha256sum] = "3f34088af7021189e04090803a4eb3386bf63d8242554c3f732361e7df3c6f54"

NPM_PKGNAME = "@textlint/linter-formatter"

inherit npmhelper
inherit native

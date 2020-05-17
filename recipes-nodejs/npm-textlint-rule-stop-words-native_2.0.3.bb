SUMMARY = "NPM: textlint-rule-stop-words"
DESCRIPTION = "Textlint rule to find filler words, buzzwords and chiches"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-stop-words"

DEPENDS = "npm-lodash-native npm-split-lines-native npm-textlint-rule-helper-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=881ad1927df541e492a0674722d840dd"

SRC_URI = "https://registry.npmjs.org/textlint-rule-stop-words/-/textlint-rule-stop-words-2.0.3.tgz"
SRC_URI[md5sum] = "8226214a062897df67214001525fad4b"
SRC_URI[sha256sum] = "2feae33d13cf37c804ab470e5c1548e346eac48b018016afbf7754bfc44bd630"

NPM_PKGNAME = "textlint-rule-stop-words"

inherit npmhelper
inherit native

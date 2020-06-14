SUMMARY = "NPM: textlint-rule-stop-words"
DESCRIPTION = "Textlint rule to find filler words, buzzwords and chiches"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-stop-words"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=881ad1927df541e492a0674722d840dd"

DEPENDS = "npm-lodash-native \
           npm-split-lines-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-stop-words/-/textlint-rule-stop-words-2.0.4.tgz"
SRC_URI[md5sum] = "49f885b777aadc3909bf44493e851180"
SRC_URI[sha256sum] = "f943828c1366766d1f4fcd8d369071f31fae880df633cc77dde84c77e96919a2"

NPM_PKGNAME = "textlint-rule-stop-words"

inherit npmhelper
inherit native

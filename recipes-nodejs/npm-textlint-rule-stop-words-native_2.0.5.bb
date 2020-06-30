SUMMARY = "NPM: textlint-rule-stop-words"
DESCRIPTION = "Textlint rule to find filler words, buzzwords and chiches"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-stop-words"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=881ad1927df541e492a0674722d840dd"

DEPENDS = "npm-lodash-native \
           npm-split-lines-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-stop-words/-/textlint-rule-stop-words-2.0.5.tgz"
SRC_URI[md5sum] = "e853ae5130f3b8de3f1317951af94950"
SRC_URI[sha256sum] = "e7271002f7018ee4ab121c49834095e3dac287ee83a84c9889502f2060e1a469"

NPM_PKGNAME = "textlint-rule-stop-words"

inherit npmhelper
inherit native

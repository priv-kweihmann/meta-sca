SUMMARY = "NPM: textlint-rule-stop-words"
DESCRIPTION = "Textlint rule to find filler words, buzzwords and chiches"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-stop-words"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=881ad1927df541e492a0674722d840dd"

DEPENDS = "npm-lodash-native \
           npm-split-lines-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-stop-words/-/textlint-rule-stop-words-2.0.6.tgz"
SRC_URI[md5sum] = "5174e2b8d1fde8b923f854c6451a2ec3"
SRC_URI[sha256sum] = "7f37fdd9375025cb9522dbc81058b128e410654656d758bbf257f65719d64ea7"

NPM_PKGNAME = "textlint-rule-stop-words"

inherit npmhelper
inherit native

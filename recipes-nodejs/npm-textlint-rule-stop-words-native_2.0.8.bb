SUMMARY = "NPM: textlint-rule-stop-words"
DESCRIPTION = "Textlint rule to find filler words, buzzwords and chiches"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-stop-words"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=881ad1927df541e492a0674722d840dd"

DEPENDS = "npm-lodash-native \
           npm-split-lines-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-stop-words/-/textlint-rule-stop-words-2.0.8.tgz"
SRC_URI[md5sum] = "96d111226b0b8547f0b174a1da18dfc9"
SRC_URI[sha256sum] = "ced1cf0664230b133e462307a342c37408739e481bf5d0776845e404dd858547"

NPM_PKGNAME = "textlint-rule-stop-words"

inherit npmhelper
inherit native

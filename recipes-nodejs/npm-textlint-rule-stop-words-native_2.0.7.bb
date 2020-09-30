SUMMARY = "NPM: textlint-rule-stop-words"
DESCRIPTION = "Textlint rule to find filler words, buzzwords and chiches"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-stop-words"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=881ad1927df541e492a0674722d840dd"

DEPENDS = "npm-lodash-native \
           npm-split-lines-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-stop-words/-/textlint-rule-stop-words-2.0.7.tgz"
SRC_URI[md5sum] = "55282b8a566f03edd0050b323f9b8e12"
SRC_URI[sha256sum] = "fe11bc9a62675a9ef7e275cfe860376df12ab2db915ab77f26cb079e4eaa9871"

NPM_PKGNAME = "textlint-rule-stop-words"

inherit npmhelper
inherit native

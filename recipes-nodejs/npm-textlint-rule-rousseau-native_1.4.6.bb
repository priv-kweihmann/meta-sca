SUMMARY = "NPM: textlint-rule-rousseau"
DESCRIPTION = "textlint rule check english sentence using rousseau"
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-rousseau"

DEPENDS = "npm-rousseau-native npm-textlint-rule-helper-native npm-textlint-util-to-string-native npm-unist-util-map-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/textlint-rule-rousseau/-/textlint-rule-rousseau-1.4.6.tgz"
SRC_URI[md5sum] = "29bb6f0215fdd6b3966286f2e0c0d20b"
SRC_URI[sha256sum] = "ff0ab130bdcd7053ed1a6da973ab440c5221576c02b51575b8da723bc4643821"

NPM_PKGNAME = "textlint-rule-rousseau"

inherit npmhelper
inherit native

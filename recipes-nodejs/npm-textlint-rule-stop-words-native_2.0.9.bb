SUMMARY = "NPM: textlint-rule-stop-words"
DESCRIPTION = "Textlint rule to find filler words, buzzwords and chiches"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-stop-words"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=881ad1927df541e492a0674722d840dd"

DEPENDS = "npm-lodash-native \
           npm-split-lines-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-stop-words/-/textlint-rule-stop-words-2.0.9.tgz"
SRC_URI[md5sum] = "35b76a436a6eec57303a178a2523c840"
SRC_URI[sha256sum] = "3ccb8f4b8be7cb1b20a3b4ad46700475cd777f71b3e27240fabf2509cfb1fb22"

NPM_PKGNAME = "textlint-rule-stop-words"

inherit npmhelper
inherit native

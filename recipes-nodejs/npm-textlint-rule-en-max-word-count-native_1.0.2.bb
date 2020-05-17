SUMMARY = "NPM: textlint-rule-en-max-word-count"
DESCRIPTION = "textlint rule that specify the maximum word count of a sentence."
HOMEPAGE = "https://github.com/azu/textlint-rule-en-max-word-count"

DEPENDS = "npm-object-assign-native npm-sentence-splitter-native npm-textlint-util-to-string-native npm-unist-util-map-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/textlint-rule-en-max-word-count/-/textlint-rule-en-max-word-count-1.0.2.tgz"
SRC_URI[md5sum] = "e9331f4b54b5240acd0d4732275dd0a5"
SRC_URI[sha256sum] = "b2249225a75da3668c57f362558a2d76199a7f48b2e5c7158bcf152d4c60776d"

NPM_PKGNAME = "textlint-rule-en-max-word-count"

inherit npmhelper
inherit native

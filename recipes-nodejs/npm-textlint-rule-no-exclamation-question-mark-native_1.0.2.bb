SUMMARY = "NPM: textlint-rule-no-exclamation-question-mark"
DESCRIPTION = "textlint rule that disallow exclamation and question mark."
HOMEPAGE = "https://github.com/azu/textlint-rule-no-exclamation-question-mark"

DEPENDS = "npm-match-index-native npm-textlint-rule-helper-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/textlint-rule-no-exclamation-question-mark/-/textlint-rule-no-exclamation-question-mark-1.0.2.tgz"
SRC_URI[md5sum] = "92f49cc21e72867c7cc0cde06ad993d8"
SRC_URI[sha256sum] = "45f724ac28d41e0bb220255311ed702b7a1bb894b4c9ae96d790af13ba72c816"

NPM_PKGNAME = "textlint-rule-no-exclamation-question-mark"

inherit npmhelper
inherit native

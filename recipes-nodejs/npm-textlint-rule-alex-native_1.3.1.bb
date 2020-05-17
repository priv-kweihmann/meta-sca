SUMMARY = "NPM: textlint-rule-alex"
DESCRIPTION = "textlint rule for alex"
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-alex"

DEPENDS = "npm-alex-native npm-textlint-rule-helper-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/textlint-rule-alex/-/textlint-rule-alex-1.3.1.tgz"
SRC_URI[md5sum] = "bba5e8a9d8089be3452248d84ec83583"
SRC_URI[sha256sum] = "79fd8041f24420466c52cd092589034d0daad764fb3832f60797f38d6470771a"

NPM_PKGNAME = "textlint-rule-alex"

inherit npmhelper
inherit native

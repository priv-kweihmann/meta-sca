SUMMARY = "NPM: textlint-rule-alex"
DESCRIPTION = "textlint rule for alex"
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-alex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-alex-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-alex/-/textlint-rule-alex-2.0.0.tgz"
SRC_URI[md5sum] = "dececf121ba6c445ce054d4523d3b0d7"
SRC_URI[sha256sum] = "f07d0bb943626229e1430808cb7cc8ad419101b95c5f8bc228c9b3f93607475b"

NPM_PKGNAME = "textlint-rule-alex"

inherit npmhelper
inherit native

SUMMARY = "NPM: textlint-rule-alex"
DESCRIPTION = "textlint rule for alex"
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-alex"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-alex-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-alex/-/textlint-rule-alex-2.1.0.tgz"
SRC_URI[md5sum] = "8705f0b2775051336d6804a0b5560bcf"
SRC_URI[sha256sum] = "8d05a2d570d068a5e18bdfb8bc05eef11c2e49b731367a080f4d1f59479d7d85"

NPM_PKGNAME = "textlint-rule-alex"

inherit npmhelper
inherit native

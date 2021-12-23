SUMMARY = "NPM: textlint-rule-no-nfd"
DESCRIPTION = "textlint rule that disallow to use NFD like 濁点."
HOMEPAGE = "https://github.com/textlint-ja/textlint-rule-no-nfd"

DEPENDS = "npm-match-index-native npm-textlint-rule-helper-native npm-unorm-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/textlint-rule-no-nfd/-/textlint-rule-no-nfd-1.0.2.tgz"
SRC_URI[md5sum] = "3a5b677347871531c029426600c6b981"
SRC_URI[sha256sum] = "4858eb2347beca3e999996a0567d3ceee126795b1ffb7fb424d4581acf1cb42e"

NPM_PKGNAME = "textlint-rule-no-nfd"

inherit npmhelper
inherit native

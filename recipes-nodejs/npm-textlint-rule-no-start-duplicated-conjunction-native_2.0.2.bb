SUMMARY = "NPM: textlint-rule-no-start-duplicated-conjunction"
DESCRIPTION = "textlint rule that check no start with duplicated conjunction."
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-no-start-duplicated-conjunction"

DEPENDS = "npm-object-assign-native npm-sentence-splitter-native npm-textlint-rule-helper-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

SRC_URI = "https://registry.npmjs.org/textlint-rule-no-start-duplicated-conjunction/-/textlint-rule-no-start-duplicated-conjunction-2.0.2.tgz"
SRC_URI[md5sum] = "02c8b5f3bca5da02c1398afc546c31dc"
SRC_URI[sha256sum] = "2d8cb47d5813649f956d876687fc1148934325f80ed8c87410d6bfdd100c45aa"

NPM_PKGNAME = "textlint-rule-no-start-duplicated-conjunction"

inherit npmhelper
inherit native

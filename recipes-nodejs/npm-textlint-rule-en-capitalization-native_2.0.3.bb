SUMMARY = "NPM: textlint-rule-en-capitalization"
DESCRIPTION = "textlint rule that check capitalization in english text."
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-en-capitalization"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-en-pos-native \
           npm-sentence-splitter-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-en-capitalization/-/textlint-rule-en-capitalization-2.0.3.tgz"
SRC_URI[md5sum] = "adaf2b9b9c067466b9793ceb5ec17fd4"
SRC_URI[sha256sum] = "f88d6268dffa2f53590541018abfc9f2f6f62a3fd8a11af36d752fa7f8778c04"

NPM_PKGNAME = "textlint-rule-en-capitalization"

inherit npmhelper
inherit native

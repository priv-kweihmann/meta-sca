SUMMARY = "NPM: textlint-rule-en-capitalization"
DESCRIPTION = "textlint rule that check capitalization in english text."
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-en-capitalization"

DEPENDS = "npm-en-pos-native npm-sentence-splitter-native npm-textlint-rule-helper-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

SRC_URI = "https://registry.npmjs.org/textlint-rule-en-capitalization/-/textlint-rule-en-capitalization-2.0.2.tgz"
SRC_URI[md5sum] = "46fdcc8a46ae49b8a524d68a4a929ec4"
SRC_URI[sha256sum] = "a10ef53fb39a6fbe03dc10023f0d51c6c06cfd40d251938af1ec475a14b5e83f"

NPM_PKGNAME = "textlint-rule-en-capitalization"

inherit npmhelper
inherit native

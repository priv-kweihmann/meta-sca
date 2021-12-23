SUMMARY = "NPM: @textlint/regexp-string-matcher"
DESCRIPTION = "Regexp-like string matcher."
HOMEPAGE = "https://github.com/textlint/regexp-string-matcher"

DEPENDS = "npm-escape-string-regexp-native npm-execall-native npm-lodash.sortby-native npm-lodash.uniq-native npm-lodash.uniqwith-native npm-to-regex-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

SRC_URI = "https://registry.npmjs.org/@textlint/regexp-string-matcher/-/regexp-string-matcher-1.1.0.tgz"
SRC_URI[md5sum] = "7df8e0a0f6addc25cfdbf736ae37881d"
SRC_URI[sha256sum] = "a1e65f7c2773ae177ede7f83fc1f82c6901b2f6857a66097d31be0510f0d8000"

NPM_PKGNAME = "@textlint/regexp-string-matcher"

inherit npmhelper
inherit native

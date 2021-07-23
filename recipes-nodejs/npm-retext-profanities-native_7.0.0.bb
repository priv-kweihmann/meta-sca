SUMMARY = "NPM: retext-profanities"
DESCRIPTION = "retext plugin to check for profane and vulgar wording"
HOMEPAGE = "https://github.com/retextjs/retext-profanities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-cuss-native \
           npm-nlcst-search-native \
           npm-nlcst-to-string-native \
           npm-pluralize-native \
           npm-quotation-native \
           npm-unified-native \
           npm-unist-util-position-native"

SRC_URI = "https://registry.npmjs.org/retext-profanities/-/retext-profanities-7.0.0.tgz"
SRC_URI[md5sum] = "a4a0d033b949368b14392548a4e662b7"
SRC_URI[sha256sum] = "7d7061d99da7269bef83d020f73edb7eb104f0dcfaab407cf56aa3a0d57ef09e"

NPM_PKGNAME = "retext-profanities"

inherit npmhelper
inherit native

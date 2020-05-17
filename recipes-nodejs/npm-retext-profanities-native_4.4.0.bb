SUMMARY = "NPM: retext-profanities"
DESCRIPTION = "Check for profane and vulgar wording with retext"
HOMEPAGE = "https://github.com/wooorm/retext-profanities#readme"

DEPENDS = "npm-cuss-native npm-lodash.difference-native npm-lodash.intersection-native npm-nlcst-search-native npm-nlcst-to-string-native npm-object-keys-native npm-pluralize-native npm-quotation-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/retext-profanities/-/retext-profanities-4.4.0.tgz"
SRC_URI[md5sum] = "0e8aebdc1ea35ae1f82970252d24dee3"
SRC_URI[sha256sum] = "ba33d5cb1d60eeead4ac01da1d4e8696c65cbdf84f7a109e619ccd3f04906ee6"

NPM_PKGNAME = "retext-profanities"

inherit npmhelper
inherit native

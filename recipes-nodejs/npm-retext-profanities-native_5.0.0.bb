SUMMARY = "NPM: retext-profanities"
DESCRIPTION = "retext plugin to check for profane and vulgar wording"
HOMEPAGE = "https://github.com/retextjs/retext-profanities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-cuss-native \
           npm-lodash.difference-native \
           npm-lodash.intersection-native \
           npm-nlcst-search-native \
           npm-nlcst-to-string-native \
           npm-object-keys-native \
           npm-pluralize-native \
           npm-quotation-native"

SRC_URI = "https://registry.npmjs.org/retext-profanities/-/retext-profanities-5.0.0.tgz"
SRC_URI[md5sum] = "47092f8737357e0e054d0c99f0da7071"
SRC_URI[sha256sum] = "7d8fe50ce895712901376cf8f0b9921e8b1e7ac62ad4158dd4adca8f2d1ba81f"

NPM_PKGNAME = "retext-profanities"

inherit npmhelper
inherit native

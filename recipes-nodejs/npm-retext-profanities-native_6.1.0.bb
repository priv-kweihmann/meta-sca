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

SRC_URI = "https://registry.npmjs.org/retext-profanities/-/retext-profanities-6.1.0.tgz"
SRC_URI[md5sum] = "0534b991c1ad9ce5a673e4b79dbd885a"
SRC_URI[sha256sum] = "66e3065d0359149c2ec87897fc4fc75864ae7116b49966dc3523959816067482"

NPM_PKGNAME = "retext-profanities"

inherit npmhelper
inherit native

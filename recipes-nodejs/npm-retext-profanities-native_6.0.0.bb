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

SRC_URI = "https://registry.npmjs.org/retext-profanities/-/retext-profanities-6.0.0.tgz"
SRC_URI[md5sum] = "683962f6cbfd7e14bc774de811bf1d9c"
SRC_URI[sha256sum] = "698fd95acaff355472487aa4d5778ced889c71af0c9fdf2d0f26e31a2823c498"

NPM_PKGNAME = "retext-profanities"

inherit npmhelper
inherit native

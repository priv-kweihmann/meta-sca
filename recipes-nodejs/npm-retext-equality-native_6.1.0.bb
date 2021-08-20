SUMMARY = "NPM: retext-equality"
DESCRIPTION = "retext plugin to warn about possible insensitive, inconsiderate language"
HOMEPAGE = "https://github.com/retextjs/retext-equality#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-normalize-native \
           npm-nlcst-search-native \
           npm-nlcst-to-string-native \
           npm-quotation-native \
           npm-types-unist-native \
           npm-unified-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-6.1.0.tgz"
SRC_URI[md5sum] = "cc8ac8432dc8cf08323ed97c32fd8e34"
SRC_URI[sha256sum] = "87df063f7173ec1b39159ef012b63ff78d6e0941c1727f2757dc2cfab2e01dcc"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

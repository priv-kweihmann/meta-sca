SUMMARY = "NPM: retext-equality"
DESCRIPTION = "retext plugin to warn about possible insensitive, inconsiderate language"
HOMEPAGE = "https://github.com/retextjs/retext-equality#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-normalize-native \
           npm-nlcst-search-native \
           npm-nlcst-to-string-native \
           npm-quotation-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-5.4.0.tgz"
SRC_URI[md5sum] = "6451ddc536ec36477ae32bb16e82a6a5"
SRC_URI[sha256sum] = "832a77868fa2e5ffa5e985e123fcec6766dd5ad8bcf60933742bb7c2f3693923"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

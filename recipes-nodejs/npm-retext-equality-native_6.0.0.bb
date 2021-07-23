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

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-6.0.0.tgz"
SRC_URI[md5sum] = "9629f43a6f50b07053310988f6b354e9"
SRC_URI[sha256sum] = "e1a646d8555a31706f4759c4f4cbb5a70d48e27a480fb848bc6fbc75b7c833d6"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

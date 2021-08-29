SUMMARY = "NPM: retext-equality"
DESCRIPTION = "retext plugin to warn about possible insensitive, inconsiderate language"
HOMEPAGE = "https://github.com/retextjs/retext-equality#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-nlcst-normalize-native \
           npm-nlcst-search-native \
           npm-nlcst-to-string-native \
           npm-quotation-native \
           npm-types-nlcst-native \
           npm-types-unist-native \
           npm-unified-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-6.2.0.tgz"
SRC_URI[md5sum] = "915d01b4dc8e09b4f42013772f01d917"
SRC_URI[sha256sum] = "325ca086113d77ca79c4e48573bc187e20c62eed7429502d24bab4b7d62018b1"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

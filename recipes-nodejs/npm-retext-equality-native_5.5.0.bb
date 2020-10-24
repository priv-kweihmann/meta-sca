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

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-5.5.0.tgz"
SRC_URI[md5sum] = "93c725d0fd52e0780307ffa0bbbb82ee"
SRC_URI[sha256sum] = "acf9bb2e8bc4be7c87b9f0f82faa47364ccde4a1565f5c5bf480627e1b221d3a"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

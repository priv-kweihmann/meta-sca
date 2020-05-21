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

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-5.0.0.tgz"
SRC_URI[md5sum] = "09d110573bb5ff0b1bbf690cb1c647d9"
SRC_URI[sha256sum] = "e26e72c03ae261475eee349ac267119a8a6454915f07bbbdb025414ab612d667"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

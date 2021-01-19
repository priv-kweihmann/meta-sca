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

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-5.6.0.tgz"
SRC_URI[md5sum] = "f18089529acd552786b3da7a78af1c51"
SRC_URI[sha256sum] = "a0aeec7c65bae1894f210ee2aa0db3ba76cf3d3e7d550fbddb90a48042b315b7"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

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

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-5.1.0.tgz"
SRC_URI[md5sum] = "6b5f4e6a967c1af1a4b4bd92e970677f"
SRC_URI[sha256sum] = "b67600c5896a3e0609eaa35df63eddfc8a48585bf27d020dc8e2fdc4816f7bcf"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

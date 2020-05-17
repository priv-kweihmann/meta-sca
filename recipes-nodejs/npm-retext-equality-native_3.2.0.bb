SUMMARY = "NPM: retext-equality"
DESCRIPTION = "Warn about possible insensitive, inconsiderate language with Retext"
HOMEPAGE = "https://github.com/wooorm/retext-equality#readme"

DEPENDS = "npm-lodash.difference-native npm-lodash.intersection-native npm-nlcst-normalize-native npm-nlcst-search-native npm-nlcst-to-string-native npm-object-keys-native npm-quotation-native npm-unist-util-visit-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-3.2.0.tgz"
SRC_URI[md5sum] = "a25ed324c5791a884e453509b2f7edea"
SRC_URI[sha256sum] = "607362968f4de0cc146ce17f763dc0e549133e6db4e8ca8f40a2ab9ac48e956e"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

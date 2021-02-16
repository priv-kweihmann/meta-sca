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

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-5.7.0.tgz"
SRC_URI[md5sum] = "7c2b2d5fa7a142161c92dd92a262e905"
SRC_URI[sha256sum] = "2f9184921b98ee83650a0cf390c7270be2a2720079ff931e9b451355652e2a20"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

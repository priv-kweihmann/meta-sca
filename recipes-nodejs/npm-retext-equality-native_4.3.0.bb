SUMMARY = "NPM: retext-equality"
DESCRIPTION = "retext plugin to warn about possible insensitive, inconsiderate language"
HOMEPAGE = "https://github.com/retextjs/retext-equality#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-lodash.difference-native \
           npm-lodash.intersection-native \
           npm-nlcst-normalize-native \
           npm-nlcst-search-native \
           npm-nlcst-to-string-native \
           npm-object-keys-native \
           npm-quotation-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/retext-equality/-/retext-equality-4.3.0.tgz"
SRC_URI[md5sum] = "99c3fe0ddf093391b5ca5f116aae0bad"
SRC_URI[sha256sum] = "9d48a0e9725f6c13a57a47ee1b766acd606b081c08db6c32acc392153020d43d"

NPM_PKGNAME = "retext-equality"

inherit npmhelper
inherit native

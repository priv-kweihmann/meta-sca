SUMMARY = "NPM: micromark-core-commonmark"
DESCRIPTION = "The CommonMark markdown constructs"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=70;endline=71;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-factory-destination-native \
           npm-micromark-factory-label-native \
           npm-micromark-factory-space-native \
           npm-micromark-factory-title-native \
           npm-micromark-factory-whitespace-native \
           npm-micromark-util-character-native \
           npm-micromark-util-chunked-native \
           npm-micromark-util-classify-character-native \
           npm-micromark-util-html-tag-name-native \
           npm-micromark-util-normalize-identifier-native \
           npm-micromark-util-resolve-all-native \
           npm-micromark-util-subtokenize-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-parse-entities-native"

SRC_URI = "https://registry.npmjs.org/micromark-core-commonmark/-/micromark-core-commonmark-1.0.1.tgz"
SRC_URI[md5sum] = "246f82a01788d467abfbf25a7dd38b7e"
SRC_URI[sha256sum] = "8133d4db619b7dc9a5985528624545a6d210b69580b33bdcea84fa29d6f469f7"

NPM_PKGNAME = "micromark-core-commonmark"

inherit npmhelper
inherit native

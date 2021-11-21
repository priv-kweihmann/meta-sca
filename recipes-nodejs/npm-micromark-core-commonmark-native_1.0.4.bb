SUMMARY = "NPM: micromark-core-commonmark"
DESCRIPTION = "The CommonMark markdown constructs"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "-1"
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
           npm-parse-entities-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-core-commonmark/-/micromark-core-commonmark-1.0.4.tgz"
SRC_URI[md5sum] = "80afa928b388d4df63b00d82d6d86ee1"
SRC_URI[sha256sum] = "930db3ad2e5bf98e55856d337f8de1fd7dd27a62a53c6e44cca5fbe0718ccffb"

NPM_PKGNAME = "micromark-core-commonmark"

inherit npmhelper
inherit native

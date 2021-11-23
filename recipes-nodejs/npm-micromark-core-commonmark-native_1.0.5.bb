SUMMARY = "NPM: micromark-core-commonmark"
DESCRIPTION = "The CommonMark markdown constructs"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=70;endline=71;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-decode-named-character-reference-native \
           npm-micromark-factory-destination-native \
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
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-core-commonmark/-/micromark-core-commonmark-1.0.5.tgz"
SRC_URI[md5sum] = "c4c4aff4ea5e7aeab0d7318af65e7b5d"
SRC_URI[sha256sum] = "bb65aef198d255e2c3c7cf675b0896e1a5ec1000cb4a46d619fd68bc8780facf"

NPM_PKGNAME = "micromark-core-commonmark"

inherit npmhelper
inherit native

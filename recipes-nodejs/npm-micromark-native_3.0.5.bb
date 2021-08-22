SUMMARY = "NPM: micromark"
DESCRIPTION = "small commonmark compliant markdown parser with positional info and concrete tokens"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-debug-native \
           npm-micromark-core-commonmark-native \
           npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-chunked-native \
           npm-micromark-util-combine-extensions-native \
           npm-micromark-util-decode-numeric-character-reference-native \
           npm-micromark-util-encode-native \
           npm-micromark-util-normalize-identifier-native \
           npm-micromark-util-resolve-all-native \
           npm-micromark-util-sanitize-uri-native \
           npm-micromark-util-subtokenize-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-parse-entities-native \
           npm-types-debug-native"

SRC_URI = "https://registry.npmjs.org/micromark/-/micromark-3.0.5.tgz"
SRC_URI[md5sum] = "c9522a747ee4d90e2711c9f0b80064bc"
SRC_URI[sha256sum] = "27b06c515af4d83f308d5be3551b04e3f1de0d259f9c71577b3ee9ccc017c019"

NPM_PKGNAME = "micromark"

inherit npmhelper
inherit native

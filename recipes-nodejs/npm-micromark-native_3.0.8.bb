SUMMARY = "NPM: micromark"
DESCRIPTION = "small commonmark compliant markdown parser with positional info and concrete tokens"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "-1"
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
           npm-types-debug-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark/-/micromark-3.0.8.tgz"
SRC_URI[md5sum] = "4bf0e88c50699eab1d1e4b26d06dabe3"
SRC_URI[sha256sum] = "77b9506f52662dd926cf427baf00ad3b606dc8d7cc5f4fb47ade9cb85d47694c"

NPM_PKGNAME = "micromark"

inherit npmhelper
inherit native

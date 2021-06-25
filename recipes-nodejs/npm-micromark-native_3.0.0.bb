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

SRC_URI = "https://registry.npmjs.org/micromark/-/micromark-3.0.0.tgz"
SRC_URI[md5sum] = "8bb801e7f9670e24d0ed5b857db0f4e3"
SRC_URI[sha256sum] = "f88ddd98b9fc21cc098a23305e8a5f6eafb6bac7c47fefb43679895f48d5fb78"

NPM_PKGNAME = "micromark"

inherit npmhelper
inherit native

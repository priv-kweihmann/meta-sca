SUMMARY = "NPM: micromark"
DESCRIPTION = "small commonmark compliant markdown parser with positional info and concrete tokens"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-debug-native \
           npm-decode-named-character-reference-native \
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
           npm-types-debug-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark/-/micromark-3.0.9.tgz"
SRC_URI[md5sum] = "c66a94ec96b68b3abd91b608e3429f96"
SRC_URI[sha256sum] = "62b776ecca1f7a5117d6a286847f7085199265101048b3b145b3b9c3d679edf4"

NPM_PKGNAME = "micromark"

inherit npmhelper
inherit native

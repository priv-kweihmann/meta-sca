SUMMARY = "NPM: micromark-factory-whitespace"
DESCRIPTION = "micromark factory to parse markdown whitespace (found in lots of places)"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=95;endline=96;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-factory-whitespace/-/micromark-factory-whitespace-1.0.0.tgz"
SRC_URI[md5sum] = "b5cc104e74ba8ae3978f027efb3a7a25"
SRC_URI[sha256sum] = "bce85973fd90a8093dc51834082fc51975e55add7b496513e08822c88629ee39"

NPM_PKGNAME = "micromark-factory-whitespace"

inherit npmhelper
inherit native

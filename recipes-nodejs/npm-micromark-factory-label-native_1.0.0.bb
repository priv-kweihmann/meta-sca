SUMMARY = "NPM: micromark-factory-label"
DESCRIPTION = "micromark factory to parse labels (found in media, definitions)"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=113;endline=114;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-factory-label/-/micromark-factory-label-1.0.0.tgz"
SRC_URI[md5sum] = "f4e47560aab78f27aa821a82c44b5314"
SRC_URI[sha256sum] = "a73f83e3ca3da1f55d52713c08e55d32f85fbe67398f7e770566ef3379899eb5"

NPM_PKGNAME = "micromark-factory-label"

inherit npmhelper
inherit native

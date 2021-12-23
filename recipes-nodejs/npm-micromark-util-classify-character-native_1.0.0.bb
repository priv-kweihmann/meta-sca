SUMMARY = "NPM: micromark-util-classify-character"
DESCRIPTION = "micromark utility to classify whether a character is whitespace or punctuation"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=96;endline=97;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-classify-character/-/micromark-util-classify-character-1.0.0.tgz"
SRC_URI[md5sum] = "65147577a6f3a478337a4db6f7ff819b"
SRC_URI[sha256sum] = "b990f515d31df06bba30b8ab571a7da48c6a0a88fac612b6cec5c9d79849478e"

NPM_PKGNAME = "micromark-util-classify-character"

inherit npmhelper
inherit native

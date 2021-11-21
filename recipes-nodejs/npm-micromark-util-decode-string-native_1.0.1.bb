SUMMARY = "NPM: micromark-util-decode-string"
DESCRIPTION = "micromark utility to decode markdown strings"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=77;endline=78;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-decode-numeric-character-reference-native \
           npm-micromark-util-symbol-native \
           npm-parse-entities-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-decode-string/-/micromark-util-decode-string-1.0.1.tgz"
SRC_URI[md5sum] = "4458e371887addda3c5483355931061e"
SRC_URI[sha256sum] = "b2ccfff2d5b9b2a13f573e089cb4865484b8ea25dd82730e377654bf02a1796d"

NPM_PKGNAME = "micromark-util-decode-string"

inherit npmhelper
inherit native

SUMMARY = "NPM: micromark-util-resolve-all"
DESCRIPTION = "micromark utility to resolve subtokens"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=135;endline=136;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-resolve-all/-/micromark-util-resolve-all-1.0.0.tgz"
SRC_URI[md5sum] = "0517fd688a837a43b0e9eea0eb1ea22a"
SRC_URI[sha256sum] = "adc77afc27010fa3f3229762e13f86e011be2b875cee58973d2f506b6418e684"

NPM_PKGNAME = "micromark-util-resolve-all"

inherit npmhelper
inherit native

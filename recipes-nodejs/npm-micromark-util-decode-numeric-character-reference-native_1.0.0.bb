SUMMARY = "NPM: micromark-util-decode-numeric-character-reference"
DESCRIPTION = "micromark utility to decode numeric character references"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=79;endline=80;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-symbol-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-decode-numeric-character-reference/-/micromark-util-decode-numeric-character-reference-1.0.0.tgz"
SRC_URI[md5sum] = "4e7c4b3a45257ae1995e8dd2c150acc1"
SRC_URI[sha256sum] = "74e82ab9b1cce304837a1d0d87375a6af63ffd5db247719b28f0361f57b009f8"

NPM_PKGNAME = "micromark-util-decode-numeric-character-reference"

inherit npmhelper
inherit native

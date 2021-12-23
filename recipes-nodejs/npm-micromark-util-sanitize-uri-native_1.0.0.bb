SUMMARY = "NPM: micromark-util-sanitize-uri"
DESCRIPTION = "micromark utility to sanitize urls"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=91;endline=92;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-encode-native \
           npm-micromark-util-symbol-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-sanitize-uri/-/micromark-util-sanitize-uri-1.0.0.tgz"
SRC_URI[md5sum] = "86fcced8b3f33e66ac73b0c4dc5c0b75"
SRC_URI[sha256sum] = "754527d7b693682465bfb3a79dd04c7b08685ccc03ee054873487fc99af9bc97"

NPM_PKGNAME = "micromark-util-sanitize-uri"

inherit npmhelper
inherit native

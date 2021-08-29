SUMMARY = "NPM: retext-english"
DESCRIPTION = "retext plugin to parse English prose"
HOMEPAGE = "https://github.com/retextjs/retext"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=119;endline=120;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-parse-english-native \
           npm-types-nlcst-native \
           npm-unherit-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/retext-english/-/retext-english-4.1.0.tgz"
SRC_URI[md5sum] = "1e856c1e4949d1be19f4caa9ecf14290"
SRC_URI[sha256sum] = "5136466f0a15cef4f8acee36771e3c0a747f201a417c6fcf02684c57ffa8b8ab"

NPM_PKGNAME = "retext-english"

inherit npmhelper
inherit native

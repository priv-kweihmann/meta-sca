SUMMARY = "NPM: micromark-util-subtokenize"
DESCRIPTION = "micromark utility to tokenize subtokens"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=81;endline=82;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-chunked-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-subtokenize/-/micromark-util-subtokenize-1.0.0.tgz"
SRC_URI[md5sum] = "61986f42938fbe6c71761d3f4e6327ae"
SRC_URI[sha256sum] = "e7459b3da6ae03eb11661f3063e92fe42a05be1bd03fb06079c07b96a40462ef"

NPM_PKGNAME = "micromark-util-subtokenize"

inherit npmhelper
inherit native

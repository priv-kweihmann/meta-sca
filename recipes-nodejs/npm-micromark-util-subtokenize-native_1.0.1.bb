SUMMARY = "NPM: micromark-util-subtokenize"
DESCRIPTION = "micromark utility to tokenize subtokens"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=81;endline=82;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-chunked-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-power-assert-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-subtokenize/-/micromark-util-subtokenize-1.0.1.tgz"
SRC_URI[md5sum] = "4dbb225e2b5768e41c8624c86bb92e8a"
SRC_URI[sha256sum] = "c4a060c1d179d0a3182af5321cfa167749637ab5e396cefa9abf883afcee5140"

NPM_PKGNAME = "micromark-util-subtokenize"

inherit npmhelper
inherit native

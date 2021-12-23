SUMMARY = "NPM: micromark-util-subtokenize"
DESCRIPTION = "micromark utility to tokenize subtokens"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=81;endline=82;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-chunked-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-subtokenize/-/micromark-util-subtokenize-1.0.2.tgz"
SRC_URI[md5sum] = "19944b25cb8c0c48519d5e80ae22f582"
SRC_URI[sha256sum] = "94e6ca3ab44289b486d02583f9abb0de48428755b3f789c78925255818a89791"

NPM_PKGNAME = "micromark-util-subtokenize"

inherit npmhelper
inherit native

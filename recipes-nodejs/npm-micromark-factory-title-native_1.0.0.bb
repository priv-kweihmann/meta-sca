SUMMARY = "NPM: micromark-factory-title"
DESCRIPTION = "micromark factory to parse markdown titles (found in resources, definitions)"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=119;endline=120;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-factory-title/-/micromark-factory-title-1.0.0.tgz"
SRC_URI[md5sum] = "491e9bc1148160e127b3efda63149028"
SRC_URI[sha256sum] = "c731767842565bd4ebce954593eb71ef7b4c3321a1d78cb7f2d214affd651fb2"

NPM_PKGNAME = "micromark-factory-title"

inherit npmhelper
inherit native

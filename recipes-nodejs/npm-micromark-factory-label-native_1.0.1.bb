SUMMARY = "NPM: micromark-factory-label"
DESCRIPTION = "micromark factory to parse labels (found in media, definitions)"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=113;endline=114;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-power-assert-native"

SRC_URI = "https://registry.npmjs.org/micromark-factory-label/-/micromark-factory-label-1.0.1.tgz"
SRC_URI[md5sum] = "417a010635525f81b786b2ccfccbf66f"
SRC_URI[sha256sum] = "3d639739f417e8994110cbd96ae6c4e21d0c6b21402e8e90d41fcc12756b03f8"

NPM_PKGNAME = "micromark-factory-label"

inherit npmhelper
inherit native

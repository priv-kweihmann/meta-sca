SUMMARY = "NPM: micromark-factory-title"
DESCRIPTION = "micromark factory to parse markdown titles (found in resources, definitions)"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=119;endline=120;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-factory-title/-/micromark-factory-title-1.0.2.tgz"
SRC_URI[md5sum] = "8e9afbbcbf3ac5a26bd2177f4cb3f704"
SRC_URI[sha256sum] = "3e0ea1d8f65aa6e04f68cc5ba249d9a2605e574361bb6e9131b72b948874a24b"

NPM_PKGNAME = "micromark-factory-title"

inherit npmhelper
inherit native

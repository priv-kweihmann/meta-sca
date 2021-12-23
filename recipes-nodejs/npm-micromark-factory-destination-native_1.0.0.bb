SUMMARY = "NPM: micromark-factory-destination"
DESCRIPTION = "micromark factory to parse destinations (found in resources, definitions)"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=120;endline=121;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-factory-destination/-/micromark-factory-destination-1.0.0.tgz"
SRC_URI[md5sum] = "49dd6deaa4ef7d040442aacc10b73fd4"
SRC_URI[sha256sum] = "8159d0fe4fa456280dc9c1aeedd16dfe44426ecdc2bdc552376a906b4c8a9281"

NPM_PKGNAME = "micromark-factory-destination"

inherit npmhelper
inherit native

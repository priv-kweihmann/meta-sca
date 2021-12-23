SUMMARY = "NPM: micromark-factory-label"
DESCRIPTION = "micromark factory to parse labels (found in media, definitions)"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=113;endline=114;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-factory-label/-/micromark-factory-label-1.0.2.tgz"
SRC_URI[md5sum] = "fdbe62bab81bde4da37d2e80f62528a6"
SRC_URI[sha256sum] = "f9828b7adf35a82ea73424d2bffccc3a0bb878e099789fc69dea4ff48cd2f8e5"

NPM_PKGNAME = "micromark-factory-label"

inherit npmhelper
inherit native

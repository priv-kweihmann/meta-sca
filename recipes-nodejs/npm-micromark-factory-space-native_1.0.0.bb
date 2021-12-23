SUMMARY = "NPM: micromark-factory-space"
DESCRIPTION = "micromark factory to parse markdown space (found in lots of places)"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=115;endline=116;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-factory-space/-/micromark-factory-space-1.0.0.tgz"
SRC_URI[md5sum] = "822ef363799f24252dd47bd264e66b29"
SRC_URI[sha256sum] = "9a78d290b4556fa7e54a4663cd8abebe74e6c31c991d44c1c9ed81d4868b1af5"

NPM_PKGNAME = "micromark-factory-space"

inherit npmhelper
inherit native

SUMMARY = "NPM: micromark-util-character"
DESCRIPTION = "micromark utility to handle character codes"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=230;endline=231;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-character/-/micromark-util-character-1.1.0.tgz"
SRC_URI[md5sum] = "5d15d0802788daf5473ee17a802657d8"
SRC_URI[sha256sum] = "3bef7bc306ad22abd0f500fd3cdaaa910355a8105fb4b16b188203581ff699d3"

NPM_PKGNAME = "micromark-util-character"

inherit npmhelper
inherit native

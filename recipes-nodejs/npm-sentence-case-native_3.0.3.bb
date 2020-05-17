SUMMARY = "NPM: sentence-case"
DESCRIPTION = "Transform into a lower case with spaces between words, then capitalize the string"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/sentence-case#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-no-case-native \
           npm-tslib-native \
           npm-upper-case-first-native"

SRC_URI = "https://registry.npmjs.org/sentence-case/-/sentence-case-3.0.3.tgz"
SRC_URI[md5sum] = "a203a2fe74db89d81a2c33c14496c924"
SRC_URI[sha256sum] = "d0090a9b1e01660dd4d898e4df023b33a7af6188d0ab7c5ae593755ea84fb6c3"

NPM_PKGNAME = "sentence-case"

inherit npmhelper
inherit native

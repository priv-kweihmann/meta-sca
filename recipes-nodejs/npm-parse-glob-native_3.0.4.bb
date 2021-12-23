SUMMARY = "NPM: parse-glob"
DESCRIPTION = "Parse a glob pattern into an object of tokens."
HOMEPAGE = "https://github.com/jonschlinkert/parse-glob"

DEPENDS = "npm-glob-base-native npm-is-dotfile-native npm-is-extglob-native npm-is-glob-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e060235353cb686ae1695ec7db63cfbc"

SRC_URI = "https://registry.npmjs.org/parse-glob/-/parse-glob-3.0.4.tgz"
SRC_URI[md5sum] = "30e8c3a31d6b2fb80f6171f8e5f5adbb"
SRC_URI[sha256sum] = "b0764545e030134c4bd7322c0c43b817416c427e98b92a698a84b6f91d5746de"

S = "${WORKDIR}/package"

NPM_PKGNAME = "parse-glob"

inherit npmhelper
inherit native

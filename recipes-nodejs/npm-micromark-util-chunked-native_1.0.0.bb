SUMMARY = "NPM: micromark-util-chunked"
DESCRIPTION = "micromark utility to splice and push with giant arrays"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=110;endline=111;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-symbol-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-chunked/-/micromark-util-chunked-1.0.0.tgz"
SRC_URI[md5sum] = "e250ba09b5a8b03b285a7812603ee312"
SRC_URI[sha256sum] = "d5276cd32c016da510837dd6ad7e1a9bc6ed888c015b1e2ef3a7279d51a6cbff"

NPM_PKGNAME = "micromark-util-chunked"

inherit npmhelper
inherit native

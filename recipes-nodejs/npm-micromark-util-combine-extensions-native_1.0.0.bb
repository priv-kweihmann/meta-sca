SUMMARY = "NPM: micromark-util-combine-extensions"
DESCRIPTION = "micromark utility to combine syntax or html extensions"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=90;endline=91;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-chunked-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-combine-extensions/-/micromark-util-combine-extensions-1.0.0.tgz"
SRC_URI[md5sum] = "1d76c100763422d297a603b888718cb2"
SRC_URI[sha256sum] = "26f428f5253480853d4e3ee5718fa85b54194a4f5361d5379648d3be0599fafb"

NPM_PKGNAME = "micromark-util-combine-extensions"

inherit npmhelper
inherit native

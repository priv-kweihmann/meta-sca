SUMMARY = "NPM: doctrine"
DESCRIPTION = "JSDoc parser"
HOMEPAGE = "https://github.com/eslint/doctrine"

DEPENDS = "npm-esutils-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d337c2208d119a8ec5ac4a485aa9cb5d"

SRC_URI = "https://registry.npmjs.org/doctrine/-/doctrine-3.0.0.tgz"
SRC_URI[md5sum] = "dd537e8e1fce32cf2340afbc56676eb8"
SRC_URI[sha256sum] = "1004df8845f9c26d6644e4d9bf1076a3d4ff758690c81ee9f485dbf9c8571d20"

NPM_PKGNAME = "doctrine"

inherit npmhelper
inherit native

SUMMARY = "NPM: @types/debug"
DESCRIPTION = "TypeScript definitions for debug"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/debug"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-ms-native"

SRC_URI = "https://registry.npmjs.org/@types/debug/-/debug-4.1.7.tgz"
SRC_URI[md5sum] = "7c59674e648a0eeb5b5640cf16355279"
SRC_URI[sha256sum] = "5fd1a4c817ca3f593b45e216b06f75ecc2e716dc4f2b244a8e7c46e61be6a9db"

NPM_PKGNAME = "@types/debug"

inherit npmhelper
inherit native

S = "${WORKDIR}/debug"

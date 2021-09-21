SUMMARY = "NPM: @types/is-empty"
DESCRIPTION = "TypeScript definitions for is-empty"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/is-empty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/is-empty/-/is-empty-1.2.1.tgz"
SRC_URI[md5sum] = "abd8c4d4054d23bff628ba46ba63b472"
SRC_URI[sha256sum] = "c27c3d8bd42530f09abea6560fe9d60cebb4af14e44d95c8154f6fb8bf7c2f55"

NPM_PKGNAME = "@types/is-empty"

inherit npmhelper
inherit native

S = "${WORKDIR}/is-empty"

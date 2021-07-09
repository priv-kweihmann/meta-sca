SUMMARY = "NPM: @types/hast"
DESCRIPTION = "TypeScript definitions for Hast"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/hast"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/@types/hast/-/hast-2.3.2.tgz"
SRC_URI[md5sum] = "78f94a64cfbe88e205f8342be461b635"
SRC_URI[sha256sum] = "e3c623806715ace64dfb2219f4331e00190f547b243e368e6e53a0f65324821b"

NPM_PKGNAME = "@types/hast"

inherit npmhelper
inherit native

S = "${WORKDIR}/hast"

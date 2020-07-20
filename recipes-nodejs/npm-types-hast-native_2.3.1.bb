SUMMARY = "NPM: @types/hast"
DESCRIPTION = "TypeScript definitions for Hast"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/@types/hast/-/hast-2.3.1.tgz"
SRC_URI[md5sum] = "e5e2cd34ec5e11095533f02107f228a0"
SRC_URI[sha256sum] = "a377a20d21fa67ff7e93c71ea83cd7c3f889881c4bce8b5e4bbbcbe42ab98ceb"

NPM_PKGNAME = "@types/hast"

inherit npmhelper
inherit native

S = "${WORKDIR}/hast"

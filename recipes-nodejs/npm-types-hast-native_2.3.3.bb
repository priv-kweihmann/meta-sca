SUMMARY = "NPM: @types/hast"
DESCRIPTION = "TypeScript definitions for Hast"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/hast"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/@types/hast/-/hast-2.3.3.tgz"
SRC_URI[md5sum] = "21135735b43dcf2927670e6180f489e3"
SRC_URI[sha256sum] = "b9b6b90e3a41830d88c2d3ab5e0fd6bd2aa4bc73fd3036761893825cef194bdb"

NPM_PKGNAME = "@types/hast"

inherit npmhelper
inherit native

S = "${WORKDIR}/hast"

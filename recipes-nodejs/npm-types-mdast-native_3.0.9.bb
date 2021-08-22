SUMMARY = "NPM: @types/mdast"
DESCRIPTION = "TypeScript definitions for Mdast"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/mdast"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/@types/mdast/-/mdast-3.0.9.tgz"
SRC_URI[md5sum] = "01f9ab5ab2db468afd1f2a2a5c84c7a2"
SRC_URI[sha256sum] = "c7bc3ad5e4893562df7fa9b79b8022d61910c8e463bf5b7ebf31a1c9187e2fd9"

NPM_PKGNAME = "@types/mdast"

inherit npmhelper
inherit native

S = "${WORKDIR}/mdast"

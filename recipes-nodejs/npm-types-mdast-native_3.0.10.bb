SUMMARY = "NPM: @types/mdast"
DESCRIPTION = "TypeScript definitions for Mdast"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/mdast"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/@types/mdast/-/mdast-3.0.10.tgz"
SRC_URI[md5sum] = "08fae7dd740603bdd6fc06876bb3ffee"
SRC_URI[sha256sum] = "ce1ffef0b83926c3ac39b3741b5329c0c992ec35303587b8399423d51ed1efbf"

NPM_PKGNAME = "@types/mdast"

inherit npmhelper
inherit native

S = "${WORKDIR}/mdast"

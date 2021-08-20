SUMMARY = "NPM: @types/mdast"
DESCRIPTION = "TypeScript definitions for Mdast"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/mdast"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/@types/mdast/-/mdast-3.0.8.tgz"
SRC_URI[md5sum] = "03c07018962fcd94f9adc44de25b423c"
SRC_URI[sha256sum] = "ab87c5aeb7d7fd5016bb04172756acea121ff4391366853b841dc20e61eeae55"

NPM_PKGNAME = "@types/mdast"

inherit npmhelper
inherit native

S = "${WORKDIR}/mdast"

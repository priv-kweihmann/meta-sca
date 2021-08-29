SUMMARY = "NPM: @types/nlcst"
DESCRIPTION = "TypeScript definitions for nlcst"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/nlcst"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/@types/nlcst/-/nlcst-1.0.0.tgz"
SRC_URI[md5sum] = "883464d2f46098fef750e95debadfbc3"
SRC_URI[sha256sum] = "7d4eb9c1dfbf5c91f0e347ed8fd4aa0b4c65e86fbdd2241282bcd933a0ff02d7"

NPM_PKGNAME = "@types/nlcst"

inherit npmhelper
inherit native

S = "${WORKDIR}/nlcst"

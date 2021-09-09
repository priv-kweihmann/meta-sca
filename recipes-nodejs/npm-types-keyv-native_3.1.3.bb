SUMMARY = "NPM: @types/keyv"
DESCRIPTION = "TypeScript definitions for keyv"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/keyv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/keyv/-/keyv-3.1.3.tgz"
SRC_URI[md5sum] = "6990fe09e2642923192925f199e41a42"
SRC_URI[sha256sum] = "5e9552649143b4e545909a3d217bcb049f1dab738ccb1fd7ec40f8d638a7aa78"

NPM_PKGNAME = "@types/keyv"

inherit npmhelper
inherit native

S = "${WORKDIR}/keyv"

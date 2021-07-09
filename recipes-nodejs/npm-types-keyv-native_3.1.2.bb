SUMMARY = "NPM: @types/keyv"
DESCRIPTION = "TypeScript definitions for keyv"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/keyv"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/keyv/-/keyv-3.1.2.tgz"
SRC_URI[md5sum] = "1622a11d060d54f2b72b967eed30cc0c"
SRC_URI[sha256sum] = "31bb43fd7a33bbea96791dc11f0557287062260448f3f16f0e10fcfaaf5fa6f6"

NPM_PKGNAME = "@types/keyv"

inherit npmhelper
inherit native

S = "${WORKDIR}/keyv"

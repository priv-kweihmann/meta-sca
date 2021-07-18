SUMMARY = "NPM: @types/concat-stream"
DESCRIPTION = "TypeScript definitions for concat-stream"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/concat-stream"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/concat-stream/-/concat-stream-1.6.1.tgz"
SRC_URI[md5sum] = "53c109db8954a6d65c2a6e7ea24d84be"
SRC_URI[sha256sum] = "3c279ef913934e457e6ae1a7e1c5d9f4f5ce57462fabc92a98b6c4887448d62e"

NPM_PKGNAME = "@types/concat-stream"

inherit npmhelper
inherit native

S = "${WORKDIR}/concat-stream"

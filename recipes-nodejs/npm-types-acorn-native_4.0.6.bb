SUMMARY = "NPM: @types/acorn"
DESCRIPTION = "TypeScript definitions for Acorn"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-estree-native"

SRC_URI = "https://registry.npmjs.org/@types/acorn/-/acorn-4.0.6.tgz"
SRC_URI[md5sum] = "91c770d368f79bd4884ce2ac5032e7fb"
SRC_URI[sha256sum] = "f7c8174a21dd7a6bbd5da2378df55627c4c36ba4f8951c9d8afabe5ce417e746"

NPM_PKGNAME = "@types/acorn"

inherit npmhelper
inherit native

S = "${WORKDIR}/acorn"

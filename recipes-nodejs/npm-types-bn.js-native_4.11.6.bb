SUMMARY = "NPM: @types/bn.js"
DESCRIPTION = "TypeScript definitions for bn.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

DEPENDS = "npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/bn.js/-/bn.js-4.11.6.tgz"
SRC_URI[md5sum] = "97f7d7d060ca132cd9837ed99cf877f2"
SRC_URI[sha256sum] = "64f15faa8a8aa47856376433103dfb8aff7d4fa9b423cf9ad67a4d10c1c586ef"

NPM_PKGNAME = "@types/bn.js"

inherit npmhelper
inherit native

S = "${WORKDIR}/bn.js"

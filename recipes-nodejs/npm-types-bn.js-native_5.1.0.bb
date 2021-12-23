SUMMARY = "NPM: @types/bn.js"
DESCRIPTION = "TypeScript definitions for bn.js"
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/bn.js/-/bn.js-5.1.0.tgz"
SRC_URI[md5sum] = "3fbd7d7d835d9f7ff33089a20e80ed13"
SRC_URI[sha256sum] = "899ae2694a86c16aacb9674f0ae009fbf8f9eea01cd8d7c51daef9d12ccb99e8"

NPM_PKGNAME = "@types/bn.js"

inherit npmhelper
inherit native

S = "${WORKDIR}/bn.js"

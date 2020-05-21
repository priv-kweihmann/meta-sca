SUMMARY = "NPM: pupa"
DESCRIPTION = "Simple micro templating"
HOMEPAGE = "https://github.com/sindresorhus/pupa#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-escape-goat-native"

SRC_URI = "https://registry.npmjs.org/pupa/-/pupa-2.0.1.tgz"
SRC_URI[md5sum] = "d41824f281f4e705f3114abb9291fab6"
SRC_URI[sha256sum] = "dcb82890172115a72f9b0ef1f90ddd4effa03e21851f3abf66fab39132e99928"

NPM_PKGNAME = "pupa"

inherit npmhelper
inherit native

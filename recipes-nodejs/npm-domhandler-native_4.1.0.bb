SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/domhandler#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-4.1.0.tgz"
SRC_URI[md5sum] = "576d3b5f849100cfa2d963109611f952"
SRC_URI[sha256sum] = "8c4ed9a04fb96a9f0842851e3c8e2df1069c07597261ce1f2246f248c4cda559"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native

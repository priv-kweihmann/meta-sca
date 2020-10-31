SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.65.tgz"
SRC_URI[md5sum] = "64c4d8c35363d9688c790ddec030187e"
SRC_URI[sha256sum] = "a663f67a0af71c0a6273abfa53f81699a07d09a0c834f3c10c92e112fcbf11f4"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

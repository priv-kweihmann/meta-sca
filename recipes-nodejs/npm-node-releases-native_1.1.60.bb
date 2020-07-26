SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.60.tgz"
SRC_URI[md5sum] = "10971ea29f9ef277a323d3f211d8b017"
SRC_URI[sha256sum] = "601a6a4249829be41040f7906db918e3d20ff392e369d4fd76d48d7f09893e25"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

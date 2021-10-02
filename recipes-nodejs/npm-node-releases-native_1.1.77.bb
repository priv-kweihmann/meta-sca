SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.77.tgz"
SRC_URI[md5sum] = "2474e6dd896b815aecb5a3ea15f8f9e5"
SRC_URI[sha256sum] = "046f3d0401b559b024984c02e3d03cc101e63c3c669d2df43676e898509ad8b0"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

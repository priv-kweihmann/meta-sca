SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.71.tgz"
SRC_URI[md5sum] = "33ef08ac8b8f4d4cad67bb733f67d9a9"
SRC_URI[sha256sum] = "7543a2d078716433c111abc9a14fc601c128dcc422c29aa96d7ecd9c75cd7a39"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.56.tgz"
SRC_URI[md5sum] = "debb63336a656d7607ff735ffb2ec668"
SRC_URI[sha256sum] = "e9756ac96f83c149eb9a97bc03df8b69035b53dfb39ce5a8f30ff56b3801f335"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

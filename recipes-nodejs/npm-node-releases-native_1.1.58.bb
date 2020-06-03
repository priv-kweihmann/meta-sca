SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.58.tgz"
SRC_URI[md5sum] = "4f13eb7510b039f383bbc8013c7c5e42"
SRC_URI[sha256sum] = "25963d6ac66dd48df105aecc1c94c8f52c5f6eb7951eb15df0fef339c4897976"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

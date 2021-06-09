SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.73.tgz"
SRC_URI[md5sum] = "7f1b5a10df8697c98c45a088002a91d5"
SRC_URI[sha256sum] = "d8a361aeb94dc84a9caab642770ea62b923563b48b6132112d75c17f4c120245"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

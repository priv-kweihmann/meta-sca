SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.69.tgz"
SRC_URI[md5sum] = "8c14ae9b4a3b438a1a097e9869098560"
SRC_URI[sha256sum] = "9643dcf0737e1dbadb025a301392fa6d29c62e9ab833888f5b1d6b965f387e9c"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

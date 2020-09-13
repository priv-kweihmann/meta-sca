SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.61.tgz"
SRC_URI[md5sum] = "ef4627f40bd3e172dcf8c290018652d9"
SRC_URI[sha256sum] = "b6dddf1a5379d933ec1ff88f068b0b831147eec9751782a6ea55f2aad86db5d5"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

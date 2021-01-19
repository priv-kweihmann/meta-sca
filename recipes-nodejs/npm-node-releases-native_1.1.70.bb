SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.70.tgz"
SRC_URI[md5sum] = "e96b7a15c6ab453cafd737764d92dee8"
SRC_URI[sha256sum] = "815260284b832c4d283bcca5c244f37dda8f844c285d9ecdbd692a8694f7a845"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

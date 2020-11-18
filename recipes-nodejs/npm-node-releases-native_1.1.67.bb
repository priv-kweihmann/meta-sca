SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.67.tgz"
SRC_URI[md5sum] = "21d1508eb698667439caab03427ec5b4"
SRC_URI[sha256sum] = "47f9fe25329b5109568727a8881fc9115a75b5e65fb9090637138351c9eb31ec"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

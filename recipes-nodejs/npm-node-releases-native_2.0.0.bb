SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-2.0.0.tgz"
SRC_URI[md5sum] = "5af3ca4d76ba749cf6a3adcbc28d8a20"
SRC_URI[sha256sum] = "ed47190a868d6cc4b9a183c6a3a1fadf0fa0e92f377d560c2f2c626d55e98f8a"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

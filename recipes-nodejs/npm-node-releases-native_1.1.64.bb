SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.64.tgz"
SRC_URI[md5sum] = "c87048eff5ab66951dd34ac3def00d6e"
SRC_URI[sha256sum] = "2e4bad74aa3c6e09b8e9bddc4d521b16d57b9bc66b4e1fd85861d644b471a222"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

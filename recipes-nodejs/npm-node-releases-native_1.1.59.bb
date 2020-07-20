SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.59.tgz"
SRC_URI[md5sum] = "c91d0ef9da96218f2768ad18d80fb25a"
SRC_URI[sha256sum] = "ee5e7e2346f0da5f59f70213aa996df4b3a5296237643a4560c100c5565c399e"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

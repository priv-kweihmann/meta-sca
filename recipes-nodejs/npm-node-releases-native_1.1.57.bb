SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.57.tgz"
SRC_URI[md5sum] = "7ea8861f93d89a70c554065c5e1be2ee"
SRC_URI[sha256sum] = "5be736ffded64eb2dc9dcd160a286a5627e55d521a78117e6235dd4b15e245a1"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

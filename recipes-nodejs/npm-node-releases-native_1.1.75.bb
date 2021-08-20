SUMMARY = "NPM: node-releases"
DESCRIPTION = "Node.js releases data"
HOMEPAGE = "https://github.com/chicoxyzzy/node-releases#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9201369490251e1be377462bd41f58eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-releases/-/node-releases-1.1.75.tgz"
SRC_URI[md5sum] = "51576f78d11d3b4fa8f8d547a0f67333"
SRC_URI[sha256sum] = "3f940bd935acb51ab78637be1ced8f2c7dcdfbe4b49f85ef78dca1da627d2670"

NPM_PKGNAME = "node-releases"

inherit npmhelper
inherit native

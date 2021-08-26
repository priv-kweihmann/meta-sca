SUMMARY = "NPM: node-addon-api"
DESCRIPTION = "Node.js API (Node-API)"
HOMEPAGE = "https://github.com/nodejs/node-addon-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-addon-api/-/node-addon-api-4.1.0.tgz"
SRC_URI[md5sum] = "6273d0d85f249da10ef12dc1266c4c49"
SRC_URI[sha256sum] = "8e24c6cda2dc33b50bdf8fd3972b421cb010370daf95c6ac220b9a9c3c2c1b2a"

NPM_PKGNAME = "node-addon-api"

inherit npmhelper
inherit native

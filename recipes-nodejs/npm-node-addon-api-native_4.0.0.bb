SUMMARY = "NPM: node-addon-api"
DESCRIPTION = "Node.js API (Node-API)"
HOMEPAGE = "https://github.com/nodejs/node-addon-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-addon-api/-/node-addon-api-4.0.0.tgz"
SRC_URI[md5sum] = "0e60232d48193f4dcb29a0ff51c3066b"
SRC_URI[sha256sum] = "d189a561a10e7baed9feb7b54e396419f1c20d13511cb644efedfb898396b6a0"

NPM_PKGNAME = "node-addon-api"

inherit npmhelper
inherit native

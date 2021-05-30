SUMMARY = "NPM: node-addon-api"
DESCRIPTION = "Node.js API (Node-API)"
HOMEPAGE = "https://github.com/nodejs/node-addon-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-addon-api/-/node-addon-api-3.2.1.tgz"
SRC_URI[md5sum] = "c4aa4436c9c7064fbdcb1d0d099d3b50"
SRC_URI[sha256sum] = "1b91635d718d4980ac560a4d598921d18447f927f48bbd073342cf5c7a4b0c2d"

NPM_PKGNAME = "node-addon-api"

inherit npmhelper
inherit native

SUMMARY = "NPM: node-addon-api"
DESCRIPTION = "Node.js API (Node-API)"
HOMEPAGE = "https://github.com/nodejs/node-addon-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-addon-api/-/node-addon-api-3.2.0.tgz"
SRC_URI[md5sum] = "bebc8b6107a8bf41920a6cdd1db9fcaf"
SRC_URI[sha256sum] = "ab5a3949e343f884162410824f5dd49cceabcf09b7d78f8ed6e38db6a027928a"

NPM_PKGNAME = "node-addon-api"

inherit npmhelper
inherit native

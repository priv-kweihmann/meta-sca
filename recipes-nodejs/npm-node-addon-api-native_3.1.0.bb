SUMMARY = "NPM: node-addon-api"
DESCRIPTION = "Node.js API (N-API)"
HOMEPAGE = "https://github.com/nodejs/node-addon-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-addon-api/-/node-addon-api-3.1.0.tgz"
SRC_URI[md5sum] = "601307b1a2ff266444330cd155e0e8b9"
SRC_URI[sha256sum] = "a97a7b2170e0257fe805078e686c6494e2218d08f222bf944fb3eb8558178548"

NPM_PKGNAME = "node-addon-api"

inherit npmhelper
inherit native

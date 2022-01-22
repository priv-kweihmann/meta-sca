SUMMARY = "NPM: node-addon-api"
DESCRIPTION = "Node.js API (Node-API)"
HOMEPAGE = "https://github.com/nodejs/node-addon-api"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-addon-api/-/node-addon-api-4.3.0.tgz"
SRC_URI[md5sum] = "b3cf432ba0d4c58120f0e97d1c74bf84"
SRC_URI[sha256sum] = "3760f2d172ef44b950ae8d3e2f932ca97f28ea8d5cc5f717451ebffd771f5cd1"

NPM_PKGNAME = "node-addon-api"

inherit npmhelper
inherit native

SUMMARY = "NPM: node-addon-api"
DESCRIPTION = "Node.js API (N-API)"
HOMEPAGE = "https://github.com/nodejs/node-addon-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-addon-api/-/node-addon-api-2.0.2.tgz"
SRC_URI[md5sum] = "b01bb7fbfc87dbdc94d48f7f49091cc4"
SRC_URI[sha256sum] = "432e55672b746f382389d07e176540816abc12c423c20fbc03c07e033dee7d1d"

NPM_PKGNAME = "node-addon-api"

inherit npmhelper
inherit native

SUMMARY = "NPM: node-addon-api"
DESCRIPTION = "Node.js API (Node-API)"
HOMEPAGE = "https://github.com/nodejs/node-addon-api"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0492ef29a9d558a3e9660e7accc9ca6a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/node-addon-api/-/node-addon-api-4.2.0.tgz"
SRC_URI[md5sum] = "b6903333f070f8e38e26ede6a3ac6730"
SRC_URI[sha256sum] = "af4c66411015e59afe521d31da0f7121942759996f15774bc63a9308ec3f2b98"

NPM_PKGNAME = "node-addon-api"

inherit npmhelper
inherit native

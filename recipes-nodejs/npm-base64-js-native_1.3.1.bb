SUMMARY = "NPM: base64-js"
DESCRIPTION = "Base64 encoding/decoding in pure JS"
HOMEPAGE = "https://github.com/beatgammit/base64-js"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea9187ca93cdc4f71219d1675712e908"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/base64-js/-/base64-js-1.3.1.tgz"
SRC_URI[md5sum] = "f93eaa7561717e2d27f678cade758053"
SRC_URI[sha256sum] = "e07a87b3d76297252f6284c37fc2c16929a80c17886740ba2093251b82e40368"

NPM_PKGNAME = "base64-js"

inherit npmhelper
inherit native

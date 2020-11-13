SUMMARY = "NPM: base64-js"
DESCRIPTION = "Base64 encoding/decoding in pure JS"
HOMEPAGE = "https://github.com/beatgammit/base64-js"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea9187ca93cdc4f71219d1675712e908"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/base64-js/-/base64-js-1.5.1.tgz"
SRC_URI[md5sum] = "09899ae5593806b4b1ec8ba9e8cc6499"
SRC_URI[sha256sum] = "b1b7a945b52685269083425216d6597e33d97bf21699d656e92fdb3eb5210a85"

NPM_PKGNAME = "base64-js"

inherit npmhelper
inherit native

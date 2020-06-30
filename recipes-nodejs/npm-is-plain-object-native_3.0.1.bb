SUMMARY = "NPM: is-plain-object"
DESCRIPTION = "Returns true if an object was created by the `Object` constructor."
HOMEPAGE = "https://github.com/jonschlinkert/is-plain-object"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d83ea4c8ec9b31d9ff2c82fa29beabb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-plain-object/-/is-plain-object-3.0.1.tgz"
SRC_URI[md5sum] = "36a1b8af98763d7e13c4360e20ba03be"
SRC_URI[sha256sum] = "9833368b171351e43c03c61035c171f70912dca64afc8bf4ad04104971e972ed"

NPM_PKGNAME = "is-plain-object"

inherit npmhelper
inherit native

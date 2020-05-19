SUMMARY = "NPM: is-plain-object"
DESCRIPTION = "Returns true if an object was created by the `Object` constructor."
HOMEPAGE = "https://github.com/jonschlinkert/is-plain-object"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d83ea4c8ec9b31d9ff2c82fa29beabb"

DEPENDS = "npm-isobject-native"

SRC_URI = "https://registry.npmjs.org/is-plain-object/-/is-plain-object-3.0.0.tgz"
SRC_URI[md5sum] = "d81f3a67e29987e1ce82205180d93e84"
SRC_URI[sha256sum] = "56aa1cae82e186bf4108bdcbc9f8aec9d23abc184bd7050d51abbf090085ca69"

NPM_PKGNAME = "is-plain-object"

inherit npmhelper
inherit native

SUMMARY = "NPM: is-plain-object"
DESCRIPTION = "Returns true if an object was created by the `Object` constructor."
HOMEPAGE = "https://github.com/jonschlinkert/is-plain-object"

DEPENDS = "npm-isobject-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d83ea4c8ec9b31d9ff2c82fa29beabb"

SRC_URI = "https://registry.npmjs.org/is-plain-object/-/is-plain-object-2.0.4.tgz"
SRC_URI[md5sum] = "335972afae19ad1eccb8eee9aad94747"
SRC_URI[sha256sum] = "4893fd94b7cf23cc0c936fdea4ada5d174e53adba6c72e7334b8cec0804ffdc6"

NPM_PKGNAME = "is-plain-object"

inherit npmhelper
inherit native

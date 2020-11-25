SUMMARY = "NPM: array-includes"
DESCRIPTION = "An ES7/ES2016 spec-compliant `Array.prototype.includes` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/array-includes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-get-intrinsic-native \
           npm-is-string-native"

SRC_URI = "https://registry.npmjs.org/array-includes/-/array-includes-3.1.2.tgz"
SRC_URI[md5sum] = "8928ec2c9389c834382ffcf9ccde681f"
SRC_URI[sha256sum] = "694ea125bcb8eddfc2fbe5113768a1fd4e5723991d2df0213d0645a8b5f67bfb"

NPM_PKGNAME = "array-includes"

inherit npmhelper
inherit native

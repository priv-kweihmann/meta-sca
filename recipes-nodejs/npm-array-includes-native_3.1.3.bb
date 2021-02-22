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

SRC_URI = "https://registry.npmjs.org/array-includes/-/array-includes-3.1.3.tgz"
SRC_URI[md5sum] = "9c2a1be0ea54ed5e7834caec3d95075f"
SRC_URI[sha256sum] = "84e7e5a44eeeba996c98a2aeb1ace5876510a7406fb83879a113733db9af20fa"

NPM_PKGNAME = "array-includes"

inherit npmhelper
inherit native

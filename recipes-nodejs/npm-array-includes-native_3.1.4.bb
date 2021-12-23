SUMMARY = "NPM: array-includes"
DESCRIPTION = "An ES7/ES2016 spec-compliant `Array.prototype.includes` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/array-includes#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-get-intrinsic-native \
           npm-is-string-native"

SRC_URI = "https://registry.npmjs.org/array-includes/-/array-includes-3.1.4.tgz"
SRC_URI[md5sum] = "9d752dc8689c23a402be29863f5c1079"
SRC_URI[sha256sum] = "9cdcf83ee2d54701efc89e0a73785538d154bd0d7db7218bdaab94047801b95c"

NPM_PKGNAME = "array-includes"

inherit npmhelper
inherit native

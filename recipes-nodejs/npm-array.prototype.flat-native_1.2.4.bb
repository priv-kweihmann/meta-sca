SUMMARY = "NPM: array.prototype.flat"
DESCRIPTION = "An ES2019 spec-compliant `Array.prototype.flat` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/Array.prototype.flat#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=611be9089fb65d181b08c36971830ef8"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.flat/-/array.prototype.flat-1.2.4.tgz"
SRC_URI[md5sum] = "7bc631c5846de85e0b0fc02353220e99"
SRC_URI[sha256sum] = "1b56d0034e43c75fc205059ffdfacf71239fb2382f8329afe43763c819b15301"

NPM_PKGNAME = "array.prototype.flat"

inherit npmhelper
inherit native

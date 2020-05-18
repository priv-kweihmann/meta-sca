SUMMARY = "NPM: array.prototype.flat"
DESCRIPTION = "An ES2019 spec-compliant `Array.prototype.flat` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/Array.prototype.flat#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=611be9089fb65d181b08c36971830ef8"

DEPENDS = "npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.flat/-/array.prototype.flat-1.2.3.tgz"
SRC_URI[md5sum] = "77a45b2b6bb01d8f0ba82e598d2769cb"
SRC_URI[sha256sum] = "72770074280ae8bfc13efe6289957c4a645d6249e9204e6d1ec07948fc7742f2"

NPM_PKGNAME = "array.prototype.flat"

inherit npmhelper
inherit native

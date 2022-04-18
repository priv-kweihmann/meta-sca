SUMMARY = "NPM: array.prototype.flat"
DESCRIPTION = "An ES2019 spec-compliant `Array.prototype.flat` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/Array.prototype.flat#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=611be9089fb65d181b08c36971830ef8"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-es-shim-unscopables-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.flat/-/array.prototype.flat-1.3.0.tgz"
SRC_URI[md5sum] = "4578f7e4eff680e7f1527b26181c52b2"
SRC_URI[sha256sum] = "fa6ddc9a63f839e89e7eda58b50879a7c8d850d48bc281a5354b9d2160d51f76"

NPM_PKGNAME = "array.prototype.flat"

inherit npmhelper
inherit native

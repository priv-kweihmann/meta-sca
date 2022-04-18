SUMMARY = "NPM: array.prototype.flatmap"
DESCRIPTION = "An ES2019 spec-compliant `Array.prototype.flatMap` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/Array.prototype.flatMap#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=611be9089fb65d181b08c36971830ef8"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-es-shim-unscopables-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.flatmap/-/array.prototype.flatmap-1.3.0.tgz"
SRC_URI[md5sum] = "9d41e3d9e79f7f0c1389be940e7a3aef"
SRC_URI[sha256sum] = "6f7e61154ec3148172a0f7fde18f71eb7d11ae8ec3f7c841d71041d1062cc8db"

NPM_PKGNAME = "array.prototype.flatmap"

inherit npmhelper
inherit native

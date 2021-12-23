SUMMARY = "NPM: array.prototype.flat"
DESCRIPTION = "An ES2019 spec-compliant `Array.prototype.flat` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/Array.prototype.flat#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=611be9089fb65d181b08c36971830ef8"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.flat/-/array.prototype.flat-1.2.5.tgz"
SRC_URI[md5sum] = "97648174e504c24169cf0eda8f034788"
SRC_URI[sha256sum] = "846fec18a5be9e6f972b366954db8b98812ee8b8873592b364a7a3e54dcb19bb"

NPM_PKGNAME = "array.prototype.flat"

inherit npmhelper
inherit native

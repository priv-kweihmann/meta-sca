SUMMARY = "NPM: array.prototype.filter"
DESCRIPTION = "An ES5 spec-compliant `Array.prototype.filter` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/Array.prototype.filter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f8d911c389327f0eb680a3eb09136223"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-es-array-method-boxes-properly-native \
           npm-is-string-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.filter/-/array.prototype.filter-1.0.0.tgz"
SRC_URI[md5sum] = "2f6c266ca3e1b83184171fa56710f70d"
SRC_URI[sha256sum] = "07fa3896f18e659387604e3858e6ccb135a20587a48c075bd291cbb35e5271f9"

NPM_PKGNAME = "array.prototype.filter"

inherit npmhelper
inherit native

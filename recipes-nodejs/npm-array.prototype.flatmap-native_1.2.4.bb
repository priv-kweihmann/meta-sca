SUMMARY = "NPM: array.prototype.flatmap"
DESCRIPTION = "An ESnext spec-compliant `Array.prototype.flatMap` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/Array.prototype.flatMap#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=611be9089fb65d181b08c36971830ef8"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native \
           npm-function-bind-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.flatmap/-/array.prototype.flatmap-1.2.4.tgz"
SRC_URI[md5sum] = "1d317a5c04c249856f4a0e96dafe5ccc"
SRC_URI[sha256sum] = "d4acea5a4e1aec5a24d4b9d6bcf0868b34e2e6fd283b1df05a6873992b4aef15"

NPM_PKGNAME = "array.prototype.flatmap"

inherit npmhelper
inherit native

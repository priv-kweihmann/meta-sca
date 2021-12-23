SUMMARY = "NPM: array.prototype.flatmap"
DESCRIPTION = "An ES2019 spec-compliant `Array.prototype.flatMap` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/Array.prototype.flatMap#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=611be9089fb65d181b08c36971830ef8"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.flatmap/-/array.prototype.flatmap-1.2.5.tgz"
SRC_URI[md5sum] = "e6064483dc0648ef44f0381637cb2c08"
SRC_URI[sha256sum] = "3f84ff12fd6e0300d5f0d54293f79b916b73ce0e349a59c596620e6a0e8649df"

NPM_PKGNAME = "array.prototype.flatmap"

inherit npmhelper
inherit native

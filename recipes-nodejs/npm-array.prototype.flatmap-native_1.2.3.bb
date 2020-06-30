SUMMARY = "NPM: array.prototype.flatmap"
DESCRIPTION = "An ESnext spec-compliant `Array.prototype.flatMap` shim/polyfill/replacement that works as far down as ES3."
HOMEPAGE = "https://github.com/es-shims/Array.prototype.flatMap#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=611be9089fb65d181b08c36971830ef8"

DEPENDS = "npm-define-properties-native \
           npm-es-abstract-native \
           npm-function-bind-native"

SRC_URI = "https://registry.npmjs.org/array.prototype.flatmap/-/array.prototype.flatmap-1.2.3.tgz"
SRC_URI[md5sum] = "c1e6640dd53a8a479923925db8a7517a"
SRC_URI[sha256sum] = "c31cd3eab61321ac6136873afabd4a2fe541b066f2b022a068ac5fdc1ba22b72"

NPM_PKGNAME = "array.prototype.flatmap"

inherit npmhelper
inherit native

SUMMARY = "NPM: is-typed-array"
DESCRIPTION = "Is this value a JS Typed Array? This module works cross-realm/iframe, does not depend on `instanceof` or mutable properties, and despite ES6 Symbol.toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-typed-array#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-available-typed-arrays-native \
           npm-call-bind-native \
           npm-es-abstract-native \
           npm-foreach-native \
           npm-has-tostringtag-native"

SRC_URI = "https://registry.npmjs.org/is-typed-array/-/is-typed-array-1.1.7.tgz"
SRC_URI[md5sum] = "39a4817bac5ab283ea905ad1b5fb67de"
SRC_URI[sha256sum] = "eed94d26af2b16cca998dce31d4f30e2b80efa0309e622d06e51d22d27d9dd99"

NPM_PKGNAME = "is-typed-array"

inherit npmhelper
inherit native

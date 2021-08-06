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

SRC_URI = "https://registry.npmjs.org/is-typed-array/-/is-typed-array-1.1.6.tgz"
SRC_URI[md5sum] = "3fa723a03b2ddab37a38c5c7a710ec8e"
SRC_URI[sha256sum] = "f353e7037c59399e714a9fef3e7b0ac5ae6955aad125d62908499043c81c4f10"

NPM_PKGNAME = "is-typed-array"

inherit npmhelper
inherit native

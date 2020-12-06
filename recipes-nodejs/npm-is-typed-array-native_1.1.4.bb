SUMMARY = "NPM: is-typed-array"
DESCRIPTION = "Is this value a JS Typed Array? This module works cross-realm/iframe, does not depend on `instanceof` or mutable properties, and despite ES6 Symbol.toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-typed-array#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-available-typed-arrays-native \
           npm-call-bind-native \
           npm-es-abstract-native \
           npm-foreach-native \
           npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/is-typed-array/-/is-typed-array-1.1.4.tgz"
SRC_URI[md5sum] = "4d1e58dd5b94ccce3475653f81fcca64"
SRC_URI[sha256sum] = "82f6c916fa2e5fe8eb3b9eab649d6bf3ecdcbc35d25b88e2396a542c6bd02edf"

NPM_PKGNAME = "is-typed-array"

inherit npmhelper
inherit native

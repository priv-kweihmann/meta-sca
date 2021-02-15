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

SRC_URI = "https://registry.npmjs.org/is-typed-array/-/is-typed-array-1.1.5.tgz"
SRC_URI[md5sum] = "f154238efe870be9f2b50400ac72013f"
SRC_URI[sha256sum] = "534a4b0ff440ba0ebdce1734a2b4b24a8cf8ad028be058e87770d3293da64453"

NPM_PKGNAME = "is-typed-array"

inherit npmhelper
inherit native

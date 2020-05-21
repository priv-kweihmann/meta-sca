SUMMARY = "NPM: is-typed-array"
DESCRIPTION = "Is this value a JS Typed Array? This module works cross-realm/iframe, does not depend on `instanceof` or mutable properties, and despite ES6 Symbol.toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-typed-array#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-available-typed-arrays-native \
           npm-es-abstract-native \
           npm-foreach-native \
           npm-has-symbols-native"

SRC_URI = "https://registry.npmjs.org/is-typed-array/-/is-typed-array-1.1.3.tgz"
SRC_URI[md5sum] = "a7e68ccb8d3adbaf8c429a3138c8516f"
SRC_URI[sha256sum] = "e08a41fc87bdbe61c36c617c22c01c878022a6cef30dd854860b4e64d474a846"

NPM_PKGNAME = "is-typed-array"

inherit npmhelper
inherit native

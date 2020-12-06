SUMMARY = "NPM: which-typed-array"
DESCRIPTION = "Which kind of Typed Array is this JavaScript value? Works cross-realm, without `instanceof`, and despite Symbol.toStringTag."
HOMEPAGE = "https://github.com/inspect-js/which-typed-array#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-available-typed-arrays-native \
           npm-call-bind-native \
           npm-es-abstract-native \
           npm-foreach-native \
           npm-function-bind-native \
           npm-has-symbols-native \
           npm-is-typed-array-native"

SRC_URI = "https://registry.npmjs.org/which-typed-array/-/which-typed-array-1.1.4.tgz"
SRC_URI[md5sum] = "13a256f76fc57a7372fe0b7f24d1fd3d"
SRC_URI[sha256sum] = "ab3038d16b5c3332a7a51d41d3d81560bfedafda59b6b28b00f7a370e51f6004"

NPM_PKGNAME = "which-typed-array"

inherit npmhelper
inherit native

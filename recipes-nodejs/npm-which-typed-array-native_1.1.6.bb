SUMMARY = "NPM: which-typed-array"
DESCRIPTION = "Which kind of Typed Array is this JavaScript value? Works cross-realm, without `instanceof`, and despite Symbol.toStringTag."
HOMEPAGE = "https://github.com/inspect-js/which-typed-array#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-available-typed-arrays-native \
           npm-call-bind-native \
           npm-es-abstract-native \
           npm-foreach-native \
           npm-has-tostringtag-native \
           npm-is-typed-array-native"

SRC_URI = "https://registry.npmjs.org/which-typed-array/-/which-typed-array-1.1.6.tgz"
SRC_URI[md5sum] = "ca46f72ac108cc3940d681991538dfcd"
SRC_URI[sha256sum] = "664ff746470e65b4fa53cfc172b79b986277b71ea2351e7dc0289e1063f2b2f8"

NPM_PKGNAME = "which-typed-array"

inherit npmhelper
inherit native

SUMMARY = "NPM: which-typed-array"
DESCRIPTION = "Which kind of Typed Array is this JavaScript value? Works cross-realm, without `instanceof`, and despite Symbol.toStringTag."
HOMEPAGE = "https://github.com/inspect-js/which-typed-array#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-available-typed-arrays-native \
           npm-es-abstract-native \
           npm-foreach-native \
           npm-function-bind-native \
           npm-has-symbols-native \
           npm-is-typed-array-native"

SRC_URI = "https://registry.npmjs.org/which-typed-array/-/which-typed-array-1.1.2.tgz"
SRC_URI[md5sum] = "4fabc1ddd73907ec65c53db3fd4e55a9"
SRC_URI[sha256sum] = "e723b52d3bbf794675b32fd8c27862474ba8c8067bacca8137d201a44f451e43"

NPM_PKGNAME = "which-typed-array"

inherit npmhelper
inherit native

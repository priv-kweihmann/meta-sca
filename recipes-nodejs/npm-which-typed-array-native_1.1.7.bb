SUMMARY = "NPM: which-typed-array"
DESCRIPTION = "Which kind of Typed Array is this JavaScript value? Works cross-realm, without `instanceof`, and despite Symbol.toStringTag."
HOMEPAGE = "https://github.com/inspect-js/which-typed-array#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-available-typed-arrays-native \
           npm-call-bind-native \
           npm-es-abstract-native \
           npm-foreach-native \
           npm-has-tostringtag-native \
           npm-is-typed-array-native"

SRC_URI = "https://registry.npmjs.org/which-typed-array/-/which-typed-array-1.1.7.tgz"
SRC_URI[md5sum] = "21e47d16590ad201c3c6aae254ee600a"
SRC_URI[sha256sum] = "88a3bf6465ed3b97431000548e25117f0e982ced71dc6a636b9d4e6726190f00"

NPM_PKGNAME = "which-typed-array"

inherit npmhelper
inherit native

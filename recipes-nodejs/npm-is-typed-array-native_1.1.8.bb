SUMMARY = "NPM: is-typed-array"
DESCRIPTION = "Is this value a JS Typed Array? This module works cross-realm/iframe, does not depend on `instanceof` or mutable properties, and despite ES6 Symbol.toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-typed-array#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-available-typed-arrays-native \
           npm-call-bind-native \
           npm-es-abstract-native \
           npm-foreach-native \
           npm-has-tostringtag-native"

SRC_URI = "https://registry.npmjs.org/is-typed-array/-/is-typed-array-1.1.8.tgz"
SRC_URI[md5sum] = "2ee77101b9e35f9ec766b2168b3a3113"
SRC_URI[sha256sum] = "65836005150490e35d9cb19c6f6a3818de311177f60f3a9040b458ee1bb4177e"

NPM_PKGNAME = "is-typed-array"

inherit npmhelper
inherit native

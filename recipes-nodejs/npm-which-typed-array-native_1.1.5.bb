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

SRC_URI = "https://registry.npmjs.org/which-typed-array/-/which-typed-array-1.1.5.tgz"
SRC_URI[md5sum] = "628dda72eaea67c1549edd8eadd14d35"
SRC_URI[sha256sum] = "e46103b22ef98eb812247780e9ceaefdac332f147629603265323cac04a2714b"

NPM_PKGNAME = "which-typed-array"

inherit npmhelper
inherit native

SUMMARY = "NPM: es-get-iterator"
DESCRIPTION = "Get an iterator for any JS language value. Works robustly across all environments, all versions."
HOMEPAGE = "https://github.com/ljharb/es-get-iterator#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = "npm-call-bind-native \
           npm-get-intrinsic-native \
           npm-has-symbols-native \
           npm-is-arguments-native \
           npm-is-map-native \
           npm-is-set-native \
           npm-is-string-native \
           npm-isarray-native"

SRC_URI = "https://registry.npmjs.org/es-get-iterator/-/es-get-iterator-1.1.1.tgz"
SRC_URI[md5sum] = "e0a1ff4d476875664c97a617a09f3ee3"
SRC_URI[sha256sum] = "e60d0fa63bc4a7ddd6f2dec6e2521ba0033e9177fb26fc52d20c34e6aa014eb4"

NPM_PKGNAME = "es-get-iterator"

inherit npmhelper
inherit native

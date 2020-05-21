SUMMARY = "NPM: es-get-iterator"
DESCRIPTION = "Get an iterator for any JS language value. Works robustly across all environments, all versions."
HOMEPAGE = "https://github.com/ljharb/es-get-iterator#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = "npm-es-abstract-native \
           npm-has-symbols-native \
           npm-is-arguments-native \
           npm-is-map-native \
           npm-is-set-native \
           npm-is-string-native \
           npm-isarray-native"

SRC_URI = "https://registry.npmjs.org/es-get-iterator/-/es-get-iterator-1.1.0.tgz"
SRC_URI[md5sum] = "0b1e0f2a816f80af9b7dd251899e8cde"
SRC_URI[sha256sum] = "8667a97354a1eab912c7ea15b7f7c4cd9525dd4313ab49bd947f29ae6a98cb7a"

NPM_PKGNAME = "es-get-iterator"

inherit npmhelper
inherit native

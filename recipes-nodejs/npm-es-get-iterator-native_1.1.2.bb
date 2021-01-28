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

SRC_URI = "https://registry.npmjs.org/es-get-iterator/-/es-get-iterator-1.1.2.tgz"
SRC_URI[md5sum] = "76e8393660df6aa1172a68aa9f961168"
SRC_URI[sha256sum] = "4ad0eb3cce28b25ef3facbcf75b6967d7a6ff079ee8d1bd962a4528e430e4052"

NPM_PKGNAME = "es-get-iterator"

inherit npmhelper
inherit native

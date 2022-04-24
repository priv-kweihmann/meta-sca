SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.9.0.tgz"
SRC_URI[md5sum] = "9862dd9912e0d8158cdb2b339c0ee148"
SRC_URI[sha256sum] = "2ba3f3317b3f4055f45e879068a1c37dafef035b407282e420ccf5fa8c13cc6d"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native

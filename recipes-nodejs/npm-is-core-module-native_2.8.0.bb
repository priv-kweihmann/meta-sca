SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.8.0.tgz"
SRC_URI[md5sum] = "545120e3ba2cde12430c1ef089e84e40"
SRC_URI[sha256sum] = "caa80c15604bb99e0936d2be5f45ff3bc74de1086e40217a6198702700b63b1e"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native

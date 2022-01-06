SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.8.1.tgz"
SRC_URI[md5sum] = "b7203baea21d3312e5c49f374855b4b3"
SRC_URI[sha256sum] = "a5476c788ef83b7ff627631136a2dfefe49e0f3c6ed00bee6ec426223c751e20"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native

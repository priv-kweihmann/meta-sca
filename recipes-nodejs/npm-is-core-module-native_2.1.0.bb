SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.1.0.tgz"
SRC_URI[md5sum] = "3d0e844d6ceaa28ae229dd5b2ed3c3e8"
SRC_URI[sha256sum] = "f7f948c9fa7454a7ee4e0b1093a1c176c6301f8d6c93f6a037d8b07b986564ec"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native

SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.5.0.tgz"
SRC_URI[md5sum] = "81744ef9abaf3625f2578ccac76a0f3c"
SRC_URI[sha256sum] = "cf03fd7c22bc4b4d3534447581ca54cd5523a1a151d6862bf46ee5a87fd507b7"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native

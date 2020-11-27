SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.2.0.tgz"
SRC_URI[md5sum] = "809831648e380c2585c0cda064993fc5"
SRC_URI[sha256sum] = "85fda9a966dd1195deacd64163a158695547098fa7c177834111346d8a4523dd"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native

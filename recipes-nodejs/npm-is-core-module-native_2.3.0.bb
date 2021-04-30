SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.3.0.tgz"
SRC_URI[md5sum] = "31b17d5b5ff213bf635b02d2560a8123"
SRC_URI[sha256sum] = "5b4cc4d0bdb75600ef0126f2cf1bb2b94e8023fce04dbddfafd320c6052d1a48"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native

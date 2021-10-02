SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.7.0.tgz"
SRC_URI[md5sum] = "c3b46174ba82fc1767b4d96272bd0313"
SRC_URI[sha256sum] = "82146c43bc34af7bcf2eca95f32ddb2f94ad268444e22e2b84e5d4bcd99e0c8a"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native

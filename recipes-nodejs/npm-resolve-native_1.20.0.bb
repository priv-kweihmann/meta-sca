SUMMARY = "NPM: resolve"
DESCRIPTION = "resolve like require.resolve() on behalf of files asynchronously and synchronously"
HOMEPAGE = "https://github.com/browserify/resolve#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=baa47288b5bd3e657a01886ce3dd0cb6"

DEPENDS = "npm-is-core-module-native \
           npm-path-parse-native"

SRC_URI = "https://registry.npmjs.org/resolve/-/resolve-1.20.0.tgz"
SRC_URI[md5sum] = "7e9568376e819375f1fa883664af6d8c"
SRC_URI[sha256sum] = "d441fb6a44363703ce6db58a81cc00f56b9d014742bd922ba0c5f993ed2ea18b"

NPM_PKGNAME = "resolve"

inherit npmhelper
inherit native

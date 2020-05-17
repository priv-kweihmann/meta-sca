SUMMARY = "NPM: locate-path"
DESCRIPTION = "Get the first path that exists on disk of multiple paths"
HOMEPAGE = "https://github.com/sindresorhus/locate-path#readme"

DEPENDS = "npm-p-locate-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/locate-path/-/locate-path-5.0.0.tgz"
SRC_URI[md5sum] = "13cc8f708d7f9f5ad9cda1a3c5ff3344"
SRC_URI[sha256sum] = "ae3d1b9360a435840a81a8c7da29f59630dd793c3f39a08f15f73fd3894053b7"

NPM_PKGNAME = "locate-path"

inherit npmhelper
inherit native

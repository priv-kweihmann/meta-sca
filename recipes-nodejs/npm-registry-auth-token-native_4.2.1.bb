SUMMARY = "NPM: registry-auth-token"
DESCRIPTION = "Get the auth token set for an npm registry (if any)"
HOMEPAGE = "https://github.com/rexxars/registry-auth-token#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b1df94b672916450d194cf7a8bd0e2d"

DEPENDS = "npm-rc-native"

SRC_URI = "https://registry.npmjs.org/registry-auth-token/-/registry-auth-token-4.2.1.tgz"
SRC_URI[md5sum] = "f9bf7b0ee6d57a8c62c60398037bb0ba"
SRC_URI[sha256sum] = "94fe23a5681c1836e82f3bab94e95df24b31d3e46beecf98beaa3d56b06eadaf"

NPM_PKGNAME = "registry-auth-token"

inherit npmhelper
inherit native

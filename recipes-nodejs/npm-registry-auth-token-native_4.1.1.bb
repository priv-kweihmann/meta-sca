SUMMARY = "NPM: registry-auth-token"
DESCRIPTION = "Get the auth token set for an npm registry (if any)"
HOMEPAGE = "https://github.com/rexxars/registry-auth-token#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b1df94b672916450d194cf7a8bd0e2d"

DEPENDS = "npm-rc-native"

SRC_URI = "https://registry.npmjs.org/registry-auth-token/-/registry-auth-token-4.1.1.tgz"
SRC_URI[md5sum] = "e3ee4a08e5a4278100daee5f195cefd5"
SRC_URI[sha256sum] = "fa2a5e0fb9b8a007e3362b9b2869b0f1512f46d63fa59a9448327c53c50da627"

NPM_PKGNAME = "registry-auth-token"

inherit npmhelper
inherit native

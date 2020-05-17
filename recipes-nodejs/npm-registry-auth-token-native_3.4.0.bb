SUMMARY = "NPM: registry-auth-token"
DESCRIPTION = "Get the auth token set for an npm registry (if any)"
HOMEPAGE = "https://github.com/rexxars/registry-auth-token#readme"

DEPENDS = "npm-rc-native npm-safe-buffer-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b1df94b672916450d194cf7a8bd0e2d"

SRC_URI = "https://registry.npmjs.org/registry-auth-token/-/registry-auth-token-3.4.0.tgz"
SRC_URI[md5sum] = "589fc8d6698af3d43a32ad8c6d5f56ec"
SRC_URI[sha256sum] = "f3a35168d9837fb60ce9d28ecc4e50b64eba821c9c06af41a3cbe7e9397bb331"

NPM_PKGNAME = "registry-auth-token"

inherit npmhelper
inherit native

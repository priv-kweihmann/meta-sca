SUMMARY = "NPM: registry-auth-token"
DESCRIPTION = "Get the auth token set for an npm registry (if any)"
HOMEPAGE = "https://github.com/rexxars/registry-auth-token#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b1df94b672916450d194cf7a8bd0e2d"

DEPENDS = "npm-rc-native"

SRC_URI = "https://registry.npmjs.org/registry-auth-token/-/registry-auth-token-4.2.0.tgz"
SRC_URI[md5sum] = "530e720a5ae1b2bdc32915a600236cc0"
SRC_URI[sha256sum] = "92e898be63cccb6a60c44348a785a0d75d3707e6d18d050364fbadad1181d993"

NPM_PKGNAME = "registry-auth-token"

inherit npmhelper
inherit native

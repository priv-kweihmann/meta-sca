SUMMARY = "NPM: global-dirs"
DESCRIPTION = "Get the directory of globally installed packages and binaries"
HOMEPAGE = "https://github.com/sindresorhus/global-dirs#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ini-native"

SRC_URI = "https://registry.npmjs.org/global-dirs/-/global-dirs-3.0.0.tgz"
SRC_URI[md5sum] = "1bd2301dbeeb43d7ec925fa14351c9fe"
SRC_URI[sha256sum] = "c45ea2ab5d241e65ad3d28ab901cd985b60eba4678832f917cc29805175b0186"

NPM_PKGNAME = "global-dirs"

inherit npmhelper
inherit native

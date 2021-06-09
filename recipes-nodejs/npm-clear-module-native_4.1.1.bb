SUMMARY = "NPM: clear-module"
DESCRIPTION = "Clear a module from the cache"
HOMEPAGE = "https://github.com/sindresorhus/clear-module#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-parent-module-native \
           npm-resolve-from-native"

SRC_URI = "https://registry.npmjs.org/clear-module/-/clear-module-4.1.1.tgz"
SRC_URI[md5sum] = "14e16d2707f1f41f699ce7f84809164e"
SRC_URI[sha256sum] = "6f69e5a617005a45e6228f3b117e6727265ffae7020f3f283c2a682bce6172bd"

NPM_PKGNAME = "clear-module"

inherit npmhelper
inherit native

SUMMARY = "NPM: parent-module"
DESCRIPTION = "Get the path of the parent module"
HOMEPAGE = "https://github.com/sindresorhus/parent-module#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-callsites-native"

SRC_URI = "https://registry.npmjs.org/parent-module/-/parent-module-2.0.0.tgz"
SRC_URI[md5sum] = "197e4eefff878db2d614b04c7dda2341"
SRC_URI[sha256sum] = "f7ef2d32abc3698ef0fdbae1d6e2ad42f4dd8f7c03bed4207d25641184bd8d34"

NPM_PKGNAME = "parent-module"

inherit npmhelper
inherit native

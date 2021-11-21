SUMMARY = "NPM: chalk"
DESCRIPTION = "Terminal string styling done right"
HOMEPAGE = "https://github.com/chalk/chalk#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-ansi-styles-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/chalk/-/chalk-4.1.2.tgz"
SRC_URI[md5sum] = "cf76e256de1debce9c7a21cd18df954d"
SRC_URI[sha256sum] = "e84c643aa53e87ace6c3d368b3cddda24a2d1434a06b6dfbdb628ad2107df90a"

NPM_PKGNAME = "chalk"

inherit npmhelper
inherit native

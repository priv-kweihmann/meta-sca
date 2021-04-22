SUMMARY = "NPM: chalk"
DESCRIPTION = "Terminal string styling done right"
HOMEPAGE = "https://github.com/chalk/chalk#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-ansi-styles-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/chalk/-/chalk-4.1.1.tgz"
SRC_URI[md5sum] = "bf6bf6baddf0e04dda5f4c9c7fe4e0e6"
SRC_URI[sha256sum] = "0f5b6589d2d5c57a46b3e9225b6fe4ee921debaa56ecb679d00e0919fc2e7e6f"

NPM_PKGNAME = "chalk"

inherit npmhelper
inherit native

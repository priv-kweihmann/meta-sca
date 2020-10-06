SUMMARY = "NPM: ansi-styles"
DESCRIPTION = "ANSI escape codes for styling strings in the terminal"
HOMEPAGE = "https://github.com/chalk/ansi-styles#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-color-convert-native"

SRC_URI = "https://registry.npmjs.org/ansi-styles/-/ansi-styles-4.3.0.tgz"
SRC_URI[md5sum] = "0534616a9bab55e3e2d350f9ab77ea22"
SRC_URI[sha256sum] = "2c539a46d85ab6033183997434d2d9a5ca2ceefc12b4db9022f564784cd7987f"

NPM_PKGNAME = "ansi-styles"

inherit npmhelper
inherit native

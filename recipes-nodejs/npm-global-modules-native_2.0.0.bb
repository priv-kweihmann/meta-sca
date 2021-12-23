SUMMARY = "NPM: global-modules"
DESCRIPTION = "The directory used by npm for globally installed npm modules."
HOMEPAGE = "https://github.com/jonschlinkert/global-modules"

DEPENDS = "npm-global-prefix-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9"

SRC_URI = "https://registry.npmjs.org/global-modules/-/global-modules-2.0.0.tgz"
SRC_URI[md5sum] = "8bc69c2ca82e97942a6f8c6baf47b94e"
SRC_URI[sha256sum] = "2457c143c8700c711d811a528287b1b7e7df255572224fe24d14e32f69636e19"

NPM_PKGNAME = "global-modules"

inherit npmhelper
inherit native

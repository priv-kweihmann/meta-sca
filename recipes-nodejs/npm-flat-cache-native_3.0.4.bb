SUMMARY = "NPM: flat-cache"
DESCRIPTION = "A stupidly simple key/value storage using files to persist some data"
HOMEPAGE = "https://github.com/royriojas/flat-cache#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=45054d16a4a3e60f7b92d0d58fb6e05d"

DEPENDS = "npm-flatted-native \
           npm-rimraf-native"

SRC_URI = "https://registry.npmjs.org/flat-cache/-/flat-cache-3.0.4.tgz"
SRC_URI[md5sum] = "ffb5a357654cca1c5ddd959e4a8909cd"
SRC_URI[sha256sum] = "d55148c32393123c0f98964e8b73c952787af37b267199079c2c29ec05a00d2e"

NPM_PKGNAME = "flat-cache"

inherit npmhelper
inherit native

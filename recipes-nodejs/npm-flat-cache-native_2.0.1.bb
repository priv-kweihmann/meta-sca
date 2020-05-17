SUMMARY = "NPM: flat-cache"
DESCRIPTION = "A stupidly simple key/value storage using files to persist some data"
HOMEPAGE = "https://github.com/royriojas/flat-cache#readme"

DEPENDS = "npm-flatted-native npm-rimraf-native npm-write-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=45054d16a4a3e60f7b92d0d58fb6e05d"

SRC_URI = "https://registry.npmjs.org/flat-cache/-/flat-cache-2.0.1.tgz"
SRC_URI[md5sum] = "d05773de91c95c16f71790160e6dbd4b"
SRC_URI[sha256sum] = "f7e2ba4d3b487985d3157799b499c21b12bbd17f68fc7043a4f0f096cf233a0d"

NPM_PKGNAME = "flat-cache"

inherit npmhelper
inherit native

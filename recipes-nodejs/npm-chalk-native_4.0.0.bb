SUMMARY = "NPM: chalk"
DESCRIPTION = "Terminal string styling done right"
HOMEPAGE = "https://github.com/chalk/chalk#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-ansi-styles-native \
           npm-supports-color-native"

SRC_URI = "https://registry.npmjs.org/chalk/-/chalk-4.0.0.tgz"
SRC_URI[md5sum] = "533b1a5eb7d01a932a32d2fae99b9330"
SRC_URI[sha256sum] = "6ef5d7f0457f5ff6427c8ae5556cb655a7c9dd26ac316d208c76beb2128e9d04"

NPM_PKGNAME = "chalk"

inherit npmhelper
inherit native

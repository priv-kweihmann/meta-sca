SUMMARY = "NPM: p-memoize"
DESCRIPTION = "Memoize promise-returning & async functions"
HOMEPAGE = "https://github.com/sindresorhus/p-memoize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-mem-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/p-memoize/-/p-memoize-4.0.1.tgz"
SRC_URI[md5sum] = "7736ce5fd8ebeed0d2dd1a85cd29fdc5"
SRC_URI[sha256sum] = "25b382dac7c4ce8fe3714f549ed28bbca7caed33a7725698c0bbff2bd748a21d"

NPM_PKGNAME = "p-memoize"

inherit npmhelper
inherit native

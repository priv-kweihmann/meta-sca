SUMMARY = "NPM: p-memoize"
DESCRIPTION = "Memoize promise-returning & async functions"
HOMEPAGE = "https://github.com/sindresorhus/p-memoize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-map-age-cleaner-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/p-memoize/-/p-memoize-5.0.1.tgz"
SRC_URI[md5sum] = "a41de01d6a300d914c2a50267f052df3"
SRC_URI[sha256sum] = "f5b6ebe1d71faec9e5a47835ab9f53f5ff658ff8320b487b420c2aa432b75fdf"

NPM_PKGNAME = "p-memoize"

inherit npmhelper
inherit native

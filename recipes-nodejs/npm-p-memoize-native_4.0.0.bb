SUMMARY = "NPM: p-memoize"
DESCRIPTION = "Memoize promise-returning & async functions"
HOMEPAGE = "https://github.com/sindresorhus/p-memoize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-mem-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/p-memoize/-/p-memoize-4.0.0.tgz"
SRC_URI[md5sum] = "63e266b6b49e31c6277c11ee6a851a52"
SRC_URI[sha256sum] = "f1658279479a53edb0b4b871ca37c0998e71d71cacd3427037a40a6de6a23957"

NPM_PKGNAME = "p-memoize"

inherit npmhelper
inherit native

SUMMARY = "NPM: p-memoize"
DESCRIPTION = "Memoize promise-returning & async functions"
HOMEPAGE = "https://github.com/sindresorhus/p-memoize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-map-age-cleaner-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/p-memoize/-/p-memoize-5.0.0.tgz"
SRC_URI[md5sum] = "3cce0eae2328e0b2ec20b0876fce3fac"
SRC_URI[sha256sum] = "0dd8b637c0f08d4790a8426dc0a036684d161e7f47ebab3005dbe1a03f8c9926"

NPM_PKGNAME = "p-memoize"

inherit npmhelper
inherit native

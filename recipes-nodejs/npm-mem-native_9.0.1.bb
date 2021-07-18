SUMMARY = "NPM: mem"
DESCRIPTION = "Memoize functions - An optimization used to speed up consecutive function calls by caching the result of calls with identical input"
HOMEPAGE = "https://github.com/sindresorhus/mem#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-map-age-cleaner-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/mem/-/mem-9.0.1.tgz"
SRC_URI[md5sum] = "f7ee3f54f7bd213a31036f11dcf38611"
SRC_URI[sha256sum] = "b026b1165b8f86c5767840899b86b3473ceb11749a8c58fddeaa68c9cd5b643d"

NPM_PKGNAME = "mem"

inherit npmhelper
inherit native

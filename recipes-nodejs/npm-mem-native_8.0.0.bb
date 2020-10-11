SUMMARY = "NPM: mem"
DESCRIPTION = "Memoize functions - An optimization used to speed up consecutive function calls by caching the result of calls with identical input"
HOMEPAGE = "https://github.com/sindresorhus/mem#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-map-age-cleaner-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/mem/-/mem-8.0.0.tgz"
SRC_URI[md5sum] = "7baff141e9ae1066168ed04026b03bfc"
SRC_URI[sha256sum] = "532b4172f18e6db9e1f3de656cd9995b8dc7d76b6dd16d25a10b0877194f02ab"

NPM_PKGNAME = "mem"

inherit npmhelper
inherit native

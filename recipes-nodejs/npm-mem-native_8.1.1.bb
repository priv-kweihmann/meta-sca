SUMMARY = "NPM: mem"
DESCRIPTION = "Memoize functions - An optimization used to speed up consecutive function calls by caching the result of calls with identical input"
HOMEPAGE = "https://github.com/sindresorhus/mem#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-map-age-cleaner-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/mem/-/mem-8.1.1.tgz"
SRC_URI[md5sum] = "8d1b57be845164ec9fca0501161ea920"
SRC_URI[sha256sum] = "00ed5b41dafe48d20477ee2229d4dfa9132290c109ead1c9951df56068efc232"

NPM_PKGNAME = "mem"

inherit npmhelper
inherit native

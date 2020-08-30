SUMMARY = "NPM: mem"
DESCRIPTION = "Memoize functions - An optimization used to speed up consecutive function calls by caching the result of calls with identical input"
HOMEPAGE = "https://github.com/sindresorhus/mem#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-map-age-cleaner-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/mem/-/mem-6.1.1.tgz"
SRC_URI[md5sum] = "e6fa5b30bd254b23dea69a81ab297ff6"
SRC_URI[sha256sum] = "260d52ae0d27f6632ec99008c122f2070851311ee8cea1a141583686361216f7"

NPM_PKGNAME = "mem"

inherit npmhelper
inherit native

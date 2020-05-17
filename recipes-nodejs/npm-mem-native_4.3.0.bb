SUMMARY = "NPM: mem"
DESCRIPTION = "Memoize functions - An optimization used to speed up consecutive function calls by caching the result of calls with identical input"
HOMEPAGE = "https://github.com/sindresorhus/mem#readme"

DEPENDS = "npm-map-age-cleaner-native npm-mimic-fn-native npm-p-is-promise-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/mem/-/mem-4.3.0.tgz"
SRC_URI[md5sum] = "c4aeab2a2a725e86d4e62a459eb9b5ed"
SRC_URI[sha256sum] = "572bfe2de699c2626fb669ee4f6fe6f77c95e75345d790c2118a099443c894dc"

NPM_PKGNAME = "mem"

inherit npmhelper
inherit native

SUMMARY = "NPM: mem"
DESCRIPTION = "Memoize functions - An optimization used to speed up consecutive function calls by caching the result of calls with identical input"
HOMEPAGE = "https://github.com/sindresorhus/mem#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-map-age-cleaner-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/mem/-/mem-6.1.0.tgz"
SRC_URI[md5sum] = "11df4ec5943d72bf87cbeefe8107687f"
SRC_URI[sha256sum] = "639d4e4ae0ebbc7b4466cfe16c786a394b75f6958be997bf8105bfec008478ec"

NPM_PKGNAME = "mem"

inherit npmhelper
inherit native

SUMMARY = "NPM: mem"
DESCRIPTION = "Memoize functions - An optimization used to speed up consecutive function calls by caching the result of calls with identical input"
HOMEPAGE = "https://github.com/sindresorhus/mem#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-map-age-cleaner-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/mem/-/mem-9.0.0.tgz"
SRC_URI[md5sum] = "faca1984e7fd11fe7754c91e22ca2331"
SRC_URI[sha256sum] = "31eb4836705e212bbc2d22d82cb84602751a435be5b619f654f731b0de5d2305"

NPM_PKGNAME = "mem"

inherit npmhelper
inherit native

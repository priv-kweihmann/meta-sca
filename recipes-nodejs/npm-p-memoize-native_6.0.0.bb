SUMMARY = "NPM: p-memoize"
DESCRIPTION = "Memoize promise-returning & async functions"
HOMEPAGE = "https://github.com/sindresorhus/p-memoize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/p-memoize/-/p-memoize-6.0.0.tgz"
SRC_URI[md5sum] = "d309243fb118cc44a470c8af5f521a6b"
SRC_URI[sha256sum] = "b3b13f893ea7b104e21a53ff9bcd4a6f9417449ac450695f20fbf3e523f5d879"

NPM_PKGNAME = "p-memoize"

inherit npmhelper
inherit native

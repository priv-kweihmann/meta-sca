SUMMARY = "NPM: p-memoize"
DESCRIPTION = "Memoize promise-returning & async functions"
HOMEPAGE = "https://github.com/sindresorhus/p-memoize#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/p-memoize/-/p-memoize-6.0.1.tgz"
SRC_URI[md5sum] = "90135101cb0e4abe28637191a9a5e260"
SRC_URI[sha256sum] = "f33c3ae4d706d96c41fa27af400301d5ec7bf4718590fa61774732291a02a11c"

NPM_PKGNAME = "p-memoize"

inherit npmhelper
inherit native

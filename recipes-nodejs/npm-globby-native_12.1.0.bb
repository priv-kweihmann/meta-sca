SUMMARY = "NPM: globby"
DESCRIPTION = "User-friendly glob matching"
HOMEPAGE = "https://github.com/sindresorhus/globby#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-array-union-native \
           npm-dir-glob-native \
           npm-fast-glob-native \
           npm-ignore-native \
           npm-merge2-native \
           npm-slash-native"

SRC_URI = "https://registry.npmjs.org/globby/-/globby-12.1.0.tgz"
SRC_URI[md5sum] = "a10af1c39dba9d615dd8d581ce1e7493"
SRC_URI[sha256sum] = "98acbe5afef4966d458b8785c6a4c08eed340cd578f3d92fca14e95f8befe1c5"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native

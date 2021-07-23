SUMMARY = "NPM: globby"
DESCRIPTION = "User-friendly glob matching"
HOMEPAGE = "https://github.com/sindresorhus/globby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-array-union-native \
           npm-dir-glob-native \
           npm-fast-glob-native \
           npm-ignore-native \
           npm-merge2-native \
           npm-slash-native"

SRC_URI = "https://registry.npmjs.org/globby/-/globby-12.0.0.tgz"
SRC_URI[md5sum] = "07b1144800de50bc041a009eb9b42834"
SRC_URI[sha256sum] = "d0b754f9941870ce885403e4643000b42dd63d64d8945857d8e3332621afdff3"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native

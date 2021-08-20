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

SRC_URI = "https://registry.npmjs.org/globby/-/globby-12.0.1.tgz"
SRC_URI[md5sum] = "6624eb3fc3e8d73bb1e8d6bce238506d"
SRC_URI[sha256sum] = "5c512f78fe317ae5f44c4ae16ec5bacf5858841a8b8a107ba822e471158e30f3"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native

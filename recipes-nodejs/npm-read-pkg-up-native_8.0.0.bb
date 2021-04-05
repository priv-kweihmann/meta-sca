SUMMARY = "NPM: read-pkg-up"
DESCRIPTION = "Read the closest package.json file"
HOMEPAGE = "https://github.com/sindresorhus/read-pkg-up#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-find-up-native \
           npm-read-pkg-native \
           npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/read-pkg-up/-/read-pkg-up-8.0.0.tgz"
SRC_URI[md5sum] = "bd5d6d70c006ec3d91b906158b28c191"
SRC_URI[sha256sum] = "ce7bcdc4eebcf0a56960a668725358e86c56dea0b5e83b1da5ee6bd7990aa310"

NPM_PKGNAME = "read-pkg-up"

inherit npmhelper
inherit native

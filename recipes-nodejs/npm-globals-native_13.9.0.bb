SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.9.0.tgz"
SRC_URI[md5sum] = "8b619fb207803769536279b5c1c0ea5d"
SRC_URI[sha256sum] = "c1cb68aae6be756ba01bd6c0bccefcc04d076d7e19ef460fe5a13aee99195fc0"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native

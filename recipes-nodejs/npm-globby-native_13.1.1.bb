SUMMARY = "NPM: globby"
DESCRIPTION = "User-friendly glob matching"
HOMEPAGE = "https://github.com/sindresorhus/globby#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-dir-glob-native \
           npm-fast-glob-native \
           npm-ignore-native \
           npm-merge2-native \
           npm-slash-native"

SRC_URI = "https://registry.npmjs.org/globby/-/globby-13.1.1.tgz"
SRC_URI[md5sum] = "6e5b57f308ccb290422805edee335da6"
SRC_URI[sha256sum] = "ec553a3242c9bf0543f4ae7dcfefc6879edfc497fcb9dc135872305fa39fbac6"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native

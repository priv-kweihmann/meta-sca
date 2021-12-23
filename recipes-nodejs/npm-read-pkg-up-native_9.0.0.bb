SUMMARY = "NPM: read-pkg-up"
DESCRIPTION = "Read the closest package.json file"
HOMEPAGE = "https://github.com/sindresorhus/read-pkg-up#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-find-up-native \
           npm-read-pkg-native \
           npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/read-pkg-up/-/read-pkg-up-9.0.0.tgz"
SRC_URI[md5sum] = "7ceba28d6469d00ebb4cdec8a9078bc6"
SRC_URI[sha256sum] = "f66247e888ca27dac1a3d74cf30b9476a5f3649f1ee2c8ebd7031a95aa99b326"

NPM_PKGNAME = "read-pkg-up"

inherit npmhelper
inherit native

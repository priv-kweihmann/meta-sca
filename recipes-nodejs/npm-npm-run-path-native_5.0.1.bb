SUMMARY = "NPM: npm-run-path"
DESCRIPTION = "Get your PATH prepended with locally installed binaries"
HOMEPAGE = "https://github.com/sindresorhus/npm-run-path#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-path-key-native"

SRC_URI = "https://registry.npmjs.org/npm-run-path/-/npm-run-path-5.0.1.tgz"
SRC_URI[md5sum] = "acd91906accefd1dfd830ba5a1419729"
SRC_URI[sha256sum] = "6daba7bfc3ef985cfa3e99cc626e42967e654c986a89dbec5064aa0c463b4cb7"

NPM_PKGNAME = "npm-run-path"

inherit npmhelper
inherit native

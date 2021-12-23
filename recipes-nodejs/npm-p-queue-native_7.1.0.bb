SUMMARY = "NPM: p-queue"
DESCRIPTION = "Promise queue with concurrency control"
HOMEPAGE = "https://github.com/sindresorhus/p-queue#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-eventemitter3-native \
           npm-p-timeout-native"

SRC_URI = "https://registry.npmjs.org/p-queue/-/p-queue-7.1.0.tgz"
SRC_URI[md5sum] = "e2f9ad3668cc09999919d2dce3dfd76c"
SRC_URI[sha256sum] = "ff9d88c3fd2abe2aada9ea2e55da053b5275bea68c7c790502427e07d3d44925"

NPM_PKGNAME = "p-queue"

inherit npmhelper
inherit native

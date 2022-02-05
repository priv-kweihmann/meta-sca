SUMMARY = "NPM: p-queue"
DESCRIPTION = "Promise queue with concurrency control"
HOMEPAGE = "https://github.com/sindresorhus/p-queue#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-eventemitter3-native \
           npm-p-timeout-native"

SRC_URI = "https://registry.npmjs.org/p-queue/-/p-queue-7.2.0.tgz"
SRC_URI[md5sum] = "431e77ea69843ab59f92a07c75239b3f"
SRC_URI[sha256sum] = "33ffd4e12d46a4762f56717ae675e1e750493a94a19192d17a9ab6b79a55f275"

NPM_PKGNAME = "p-queue"

inherit npmhelper
inherit native

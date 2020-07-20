SUMMARY = "NPM: p-queue"
DESCRIPTION = "Promise queue with concurrency control"
HOMEPAGE = "https://github.com/sindresorhus/p-queue#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-eventemitter3-native \
           npm-p-timeout-native"

SRC_URI = "https://registry.npmjs.org/p-queue/-/p-queue-6.6.0.tgz"
SRC_URI[md5sum] = "5efd7dfdeb2def382828d272abdd0198"
SRC_URI[sha256sum] = "1494e38ff47550e32fe997ae4ca107372c5c201fbe39607f6f3517f57b6a01c9"

NPM_PKGNAME = "p-queue"

inherit npmhelper
inherit native

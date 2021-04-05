SUMMARY = "NPM: p-queue"
DESCRIPTION = "Promise queue with concurrency control"
HOMEPAGE = "https://github.com/sindresorhus/p-queue#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-eventemitter3-native \
           npm-p-timeout-native"

SRC_URI = "https://registry.npmjs.org/p-queue/-/p-queue-7.0.0.tgz"
SRC_URI[md5sum] = "6babc0e17c3acad8af159f444d97b7aa"
SRC_URI[sha256sum] = "80c1344af8d62733274d47d945c32bfb58938caf142742fa8c71d12df9c9512c"

NPM_PKGNAME = "p-queue"

inherit npmhelper
inherit native

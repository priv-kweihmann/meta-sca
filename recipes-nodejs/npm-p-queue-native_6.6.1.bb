SUMMARY = "NPM: p-queue"
DESCRIPTION = "Promise queue with concurrency control"
HOMEPAGE = "https://github.com/sindresorhus/p-queue#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-eventemitter3-native \
           npm-p-timeout-native"

SRC_URI = "https://registry.npmjs.org/p-queue/-/p-queue-6.6.1.tgz"
SRC_URI[md5sum] = "44ca4b1216c6ea97e5fbc07ac0b085c4"
SRC_URI[sha256sum] = "31c626623e057c866271d88c827fc2e819c326a77cc6c9518cff2a6b0278b8e0"

NPM_PKGNAME = "p-queue"

inherit npmhelper
inherit native

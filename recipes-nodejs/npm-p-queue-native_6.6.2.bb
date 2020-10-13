SUMMARY = "NPM: p-queue"
DESCRIPTION = "Promise queue with concurrency control"
HOMEPAGE = "https://github.com/sindresorhus/p-queue#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-eventemitter3-native \
           npm-p-timeout-native"

SRC_URI = "https://registry.npmjs.org/p-queue/-/p-queue-6.6.2.tgz"
SRC_URI[md5sum] = "ae40fdaf90462d0091ac8fbddd3d16b8"
SRC_URI[sha256sum] = "4d94fe81f32ce77f88f6d7b676fdff3a844a1ac445da522b2a1d9467b86a405d"

NPM_PKGNAME = "p-queue"

inherit npmhelper
inherit native

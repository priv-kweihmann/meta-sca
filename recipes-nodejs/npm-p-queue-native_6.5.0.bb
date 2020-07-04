SUMMARY = "NPM: p-queue"
DESCRIPTION = "Promise queue with concurrency control"
HOMEPAGE = "https://github.com/sindresorhus/p-queue#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-eventemitter3-native \
           npm-p-timeout-native"

SRC_URI = "https://registry.npmjs.org/p-queue/-/p-queue-6.5.0.tgz"
SRC_URI[md5sum] = "e6c519a75dfc78000a9fe0bafe0ac5ea"
SRC_URI[sha256sum] = "f3bf44b5b81d0b73647e4bb9a1a107e0db7b674fa2debf342fcca51d224e2362"

NPM_PKGNAME = "p-queue"

inherit npmhelper
inherit native

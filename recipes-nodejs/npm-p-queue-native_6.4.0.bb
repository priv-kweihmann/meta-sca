SUMMARY = "NPM: p-queue"
DESCRIPTION = "Promise queue with concurrency control"
HOMEPAGE = "https://github.com/sindresorhus/p-queue#readme"

DEPENDS = "npm-eventemitter3-native npm-p-timeout-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/p-queue/-/p-queue-6.4.0.tgz"
SRC_URI[md5sum] = "87a2433592bcb93e1e064a62c644d13e"
SRC_URI[sha256sum] = "5c32410827dad7a63ff4935679a073c8eed5d27f67087fa0f2b81e7d6a7001e9"

NPM_PKGNAME = "p-queue"

inherit npmhelper
inherit native

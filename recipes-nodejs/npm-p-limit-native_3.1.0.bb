SUMMARY = "NPM: p-limit"
DESCRIPTION = "Run multiple promise-returning & async functions with limited concurrency"
HOMEPAGE = "https://github.com/sindresorhus/p-limit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-yocto-queue-native"

SRC_URI = "https://registry.npmjs.org/p-limit/-/p-limit-3.1.0.tgz"
SRC_URI[md5sum] = "1362f362e00b9e967f1f922cf1a0a872"
SRC_URI[sha256sum] = "36e6519736cafaa158dc1bca8137683f5bf1bc1c476d40519028b3f3a96bc9e0"

NPM_PKGNAME = "p-limit"

inherit npmhelper
inherit native

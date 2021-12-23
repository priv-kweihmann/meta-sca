SUMMARY = "NPM: p-limit"
DESCRIPTION = "Run multiple promise-returning & async functions with limited concurrency"
HOMEPAGE = "https://github.com/sindresorhus/p-limit#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-yocto-queue-native"

SRC_URI = "https://registry.npmjs.org/p-limit/-/p-limit-4.0.0.tgz"
SRC_URI[md5sum] = "ead17445bdd5e0de78d7d97635e358eb"
SRC_URI[sha256sum] = "89fec0c479eaa1ac35b8b2f9820efb8cb32a5d5f2bf9b9a235c7fb45550f36bd"

NPM_PKGNAME = "p-limit"

inherit npmhelper
inherit native

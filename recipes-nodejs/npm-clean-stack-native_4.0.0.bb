SUMMARY = "NPM: clean-stack"
DESCRIPTION = "Clean up error stack traces"
HOMEPAGE = "https://github.com/sindresorhus/clean-stack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-escape-string-regexp-native"

SRC_URI = "https://registry.npmjs.org/clean-stack/-/clean-stack-4.0.0.tgz"
SRC_URI[md5sum] = "4954094b1aa1cbb6f5ebcc186cd48f09"
SRC_URI[sha256sum] = "580db9cd3e483ee78b02ef094ca05202174721b16283b52bbbf5dfd8df023262"

NPM_PKGNAME = "clean-stack"

inherit npmhelper
inherit native

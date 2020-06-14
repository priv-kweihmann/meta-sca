SUMMARY = "NPM: p-limit"
DESCRIPTION = "Run multiple promise-returning & async functions with limited concurrency"
HOMEPAGE = "https://github.com/sindresorhus/p-limit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-p-try-native"

SRC_URI = "https://registry.npmjs.org/p-limit/-/p-limit-3.0.1.tgz"
SRC_URI[md5sum] = "ee37da0941392aad91fd8a2df79ff216"
SRC_URI[sha256sum] = "214b6e9098fdba73502e07a9cd18c3b230a076e2c9d464d3cc558fcce6512469"

NPM_PKGNAME = "p-limit"

inherit npmhelper
inherit native

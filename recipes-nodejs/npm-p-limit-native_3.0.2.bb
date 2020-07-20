SUMMARY = "NPM: p-limit"
DESCRIPTION = "Run multiple promise-returning & async functions with limited concurrency"
HOMEPAGE = "https://github.com/sindresorhus/p-limit#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-p-try-native"

SRC_URI = "https://registry.npmjs.org/p-limit/-/p-limit-3.0.2.tgz"
SRC_URI[md5sum] = "e5986d7cc72b067c234bb525f8a3b961"
SRC_URI[sha256sum] = "93c7dfc36fee3a7279bdbdc26f63e9ba96544f7e05fefb9d2d92915983d56467"

NPM_PKGNAME = "p-limit"

inherit npmhelper
inherit native

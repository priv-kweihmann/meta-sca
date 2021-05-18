SUMMARY = "NPM: clean-stack"
DESCRIPTION = "Clean up error stack traces"
HOMEPAGE = "https://github.com/sindresorhus/clean-stack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-escape-string-regexp-native"

SRC_URI = "https://registry.npmjs.org/clean-stack/-/clean-stack-4.0.1.tgz"
SRC_URI[md5sum] = "c37811de9e0b1da448319d7f9ad5ed92"
SRC_URI[sha256sum] = "f3e81d95cc82f94700a35e4211c78a444e6e81a503fc25ea3e1e079990a90ad8"

NPM_PKGNAME = "clean-stack"

inherit npmhelper
inherit native

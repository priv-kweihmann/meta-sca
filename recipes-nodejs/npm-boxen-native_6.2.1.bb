SUMMARY = "NPM: boxen"
DESCRIPTION = "Create boxes in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/boxen#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ansi-align-native \
           npm-camelcase-native \
           npm-chalk-native \
           npm-cli-boxes-native \
           npm-string-width-native \
           npm-type-fest-native \
           npm-widest-line-native \
           npm-wrap-ansi-native"

SRC_URI = "https://registry.npmjs.org/boxen/-/boxen-6.2.1.tgz"
SRC_URI[md5sum] = "40f5c8300d3a63f1d19042a5d35c9f90"
SRC_URI[sha256sum] = "8d5669d7c96d1940ecaf7396e2043e3cfe7f7e756dc83ef6af312ee63805825d"

NPM_PKGNAME = "boxen"

inherit npmhelper
inherit native

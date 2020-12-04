SUMMARY = "NPM: execa"
DESCRIPTION = "Process execution for humans"
HOMEPAGE = "https://github.com/sindresorhus/execa#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-cross-spawn-native \
           npm-get-stream-native \
           npm-human-signals-native \
           npm-is-stream-native \
           npm-merge-stream-native \
           npm-npm-run-path-native \
           npm-onetime-native \
           npm-signal-exit-native \
           npm-strip-final-newline-native"

SRC_URI = "https://registry.npmjs.org/execa/-/execa-5.0.0.tgz"
SRC_URI[md5sum] = "dfb3ffad74b31c29cf1ee29f2bcda9c9"
SRC_URI[sha256sum] = "db174fc2b6eb1a0187a25326bdd07e4a6328e102fb7911e2d24418ac99ac6102"

NPM_PKGNAME = "execa"

inherit npmhelper
inherit native

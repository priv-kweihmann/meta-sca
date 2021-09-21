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

SRC_URI = "https://registry.npmjs.org/execa/-/execa-5.1.1.tgz"
SRC_URI[md5sum] = "10ad9c01d8e042aff2353de77d718a5c"
SRC_URI[sha256sum] = "6fdd821f7b8d62867017c9729c362de3992c607fb59bcf8c95d96bc9d0196cf3"

NPM_PKGNAME = "execa"

inherit npmhelper
inherit native

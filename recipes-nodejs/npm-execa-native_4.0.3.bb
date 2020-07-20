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

SRC_URI = "https://registry.npmjs.org/execa/-/execa-4.0.3.tgz"
SRC_URI[md5sum] = "fece440ca9513123ac8d7b37d9a0d852"
SRC_URI[sha256sum] = "bea3be169d386eb37007c596a67a6c69dc959bb3c738d195c707af4c5b820ec0"

NPM_PKGNAME = "execa"

inherit npmhelper
inherit native

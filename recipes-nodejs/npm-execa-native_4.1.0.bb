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

SRC_URI = "https://registry.npmjs.org/execa/-/execa-4.1.0.tgz"
SRC_URI[md5sum] = "b809c987fa66a6f51dc9d0f792e9d7f6"
SRC_URI[sha256sum] = "139f2f9a6d32991cd677b42f75e889ffe09ff3cf866068245a05a891abd768cd"

NPM_PKGNAME = "execa"

inherit npmhelper
inherit native

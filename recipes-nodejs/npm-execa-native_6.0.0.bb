SUMMARY = "NPM: execa"
DESCRIPTION = "Process execution for humans"
HOMEPAGE = "https://github.com/sindresorhus/execa#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/execa/-/execa-6.0.0.tgz"
SRC_URI[md5sum] = "7abd0ee00b0c86844bd30c370a349f5a"
SRC_URI[sha256sum] = "492a223e8e91e9feae15e8ed53e6cd9d28f78266b58b3623b7eb1763df50032a"

NPM_PKGNAME = "execa"

inherit npmhelper
inherit native

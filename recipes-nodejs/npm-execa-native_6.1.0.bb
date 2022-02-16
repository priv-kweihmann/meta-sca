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

SRC_URI = "https://registry.npmjs.org/execa/-/execa-6.1.0.tgz"
SRC_URI[md5sum] = "b09671dab6fe1adf162098d037a4a5af"
SRC_URI[sha256sum] = "aeaf03c817daf2e098484106dc5b968a5a7308888962db54821d34caf6dbde32"

NPM_PKGNAME = "execa"

inherit npmhelper
inherit native

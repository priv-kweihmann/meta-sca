SUMMARY = "NPM: execa"
DESCRIPTION = "Process execution for humans"
HOMEPAGE = "https://github.com/sindresorhus/execa#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-cross-spawn-native \
           npm-get-stream-native \
           npm-human-signals-native \
           npm-is-stream-native \
           npm-merge-stream-native \
           npm-npm-run-path-native \
           npm-onetime-native \
           npm-signal-exit-native \
           npm-strip-final-newline-native"

SRC_URI = "https://registry.npmjs.org/execa/-/execa-4.0.1.tgz"
SRC_URI[md5sum] = "2c2f2e4f2339c06667ac0d2004fd807f"
SRC_URI[sha256sum] = "8487aeebcffd14e9fc1df61a7fa8395967efdba5094c844e90fb09a671e695d4"

NPM_PKGNAME = "execa"

inherit npmhelper
inherit native

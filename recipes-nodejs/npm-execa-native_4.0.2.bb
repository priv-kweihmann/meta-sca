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

SRC_URI = "https://registry.npmjs.org/execa/-/execa-4.0.2.tgz"
SRC_URI[md5sum] = "f36a794f3afe11e6ea2cd61673f4ab64"
SRC_URI[sha256sum] = "7a5787620d06dfcdb6e10b756c7096cd52af0be480b2f9cccc9725513c712cf2"

NPM_PKGNAME = "execa"

inherit npmhelper
inherit native

SUMMARY = "NPM: bubble-stream-error"
DESCRIPTION = "Bubble errors from an array of streams to a master/top stream"
HOMEPAGE = "https://github.com/alessioalex/bubble-stream-error#readme"

DEPENDS = "npm-once-native npm-sliced-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=46;md5=de52438bd212bba4e70b37f9f82477b8"

SRC_URI = "https://registry.npmjs.org/bubble-stream-error/-/bubble-stream-error-1.0.0.tgz"
SRC_URI[md5sum] = "7c87c8e26ecaecda8aa146fb0e8bfb46"
SRC_URI[sha256sum] = "350de51689503226a29e3b0f2947554d038214a3033b8593ad86f422b25a5968"

NPM_PKGNAME = "bubble-stream-error"

inherit npmhelper
inherit native

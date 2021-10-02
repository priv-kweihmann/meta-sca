SUMMARY = "NPM: power-assert-renderer-comparison"
DESCRIPTION = "comparison renderer for power-assert context"
HOMEPAGE = "https://github.com/twada/power-assert-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=103;endline=104;md5=fb09d58b915b126f1c353f70c292ce4e"

DEPENDS = "npm-core-js-native \
           npm-diff-match-patch-native \
           npm-power-assert-renderer-base-native \
           npm-stringifier-native \
           npm-type-name-native"

SRC_URI = "https://registry.npmjs.org/power-assert-renderer-comparison/-/power-assert-renderer-comparison-1.2.0.tgz"
SRC_URI[md5sum] = "d6906c5eeae4739a0f5b60296ffd4307"
SRC_URI[sha256sum] = "24884c2b4e6f212322598c3630fa3676d751d5e5b1a1eeede19cbfc4438ae4ca"

NPM_PKGNAME = "power-assert-renderer-comparison"

inherit npmhelper
inherit native

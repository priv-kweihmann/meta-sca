SUMMARY = "NPM: power-assert-context-traversal"
DESCRIPTION = "traverse power-assert context"
HOMEPAGE = "https://github.com/twada/power-assert-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=118;endline=119;md5=fb09d58b915b126f1c353f70c292ce4e"

DEPENDS = "npm-core-js-native \
           npm-estraverse-native"

SRC_URI = "https://registry.npmjs.org/power-assert-context-traversal/-/power-assert-context-traversal-1.2.0.tgz"
SRC_URI[md5sum] = "4f1ebe3c35578c2b5153f69582bbbe0f"
SRC_URI[sha256sum] = "e5022292889ec24fdfdce74b88f59f9cef20119753e7d5f314926f2520d9cee1"

NPM_PKGNAME = "power-assert-context-traversal"

inherit npmhelper
inherit native

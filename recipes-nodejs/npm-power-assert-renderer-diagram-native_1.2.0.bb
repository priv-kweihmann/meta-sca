SUMMARY = "NPM: power-assert-renderer-diagram"
DESCRIPTION = "diagram renderer for power-assert context"
HOMEPAGE = "https://github.com/twada/power-assert-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=102;endline=103;md5=fb09d58b915b126f1c353f70c292ce4e"

DEPENDS = "npm-core-js-native \
           npm-power-assert-renderer-base-native \
           npm-power-assert-util-string-width-native \
           npm-stringifier-native"

SRC_URI = "https://registry.npmjs.org/power-assert-renderer-diagram/-/power-assert-renderer-diagram-1.2.0.tgz"
SRC_URI[md5sum] = "12076ff9e95b1135f420e4ac877a61bb"
SRC_URI[sha256sum] = "70d5b69fe0896a7389964b1bc3aed9d8bc21e0c3c30b0a37fed6c71f5c3182e5"

NPM_PKGNAME = "power-assert-renderer-diagram"

inherit npmhelper
inherit native

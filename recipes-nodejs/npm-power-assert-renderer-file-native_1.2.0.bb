SUMMARY = "NPM: power-assert-renderer-file"
DESCRIPTION = "filepath renderer for power-assert context"
HOMEPAGE = "https://github.com/twada/power-assert-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=37;endline=38;md5=fb09d58b915b126f1c353f70c292ce4e"

DEPENDS = "npm-power-assert-renderer-base-native"

SRC_URI = "https://registry.npmjs.org/power-assert-renderer-file/-/power-assert-renderer-file-1.2.0.tgz"
SRC_URI[md5sum] = "1b7154cbbc12fda42521f9d201ee9744"
SRC_URI[sha256sum] = "c86d327f131760741c10bbffa5b0fc43357213ce90febd1f340b2cf63636b25c"

NPM_PKGNAME = "power-assert-renderer-file"

inherit npmhelper
inherit native

SUMMARY = "NPM: empower-core"
DESCRIPTION = "Power Assert feature enhancer for assert function/object"
HOMEPAGE = "https://github.com/twada/power-assert-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=276;endline=277;md5=fb09d58b915b126f1c353f70c292ce4e"

DEPENDS = "npm-call-signature-native \
           npm-core-js-native"

SRC_URI = "https://registry.npmjs.org/empower-core/-/empower-core-1.2.0.tgz"
SRC_URI[md5sum] = "de61cf2d2f9e904d95199f9be7406131"
SRC_URI[sha256sum] = "0515734aeefa25c4c04649f6a6e9a629e5ce5d016a8d5b77153903049db10ddc"

NPM_PKGNAME = "empower-core"

inherit npmhelper
inherit native

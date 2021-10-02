SUMMARY = "NPM: power-assert-context-formatter"
DESCRIPTION = "format power-assert context"
HOMEPAGE = "https://github.com/twada/power-assert-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=180;endline=181;md5=fb09d58b915b126f1c353f70c292ce4e"

DEPENDS = "npm-core-js-native \
           npm-power-assert-context-traversal-native"

SRC_URI = "https://registry.npmjs.org/power-assert-context-formatter/-/power-assert-context-formatter-1.2.0.tgz"
SRC_URI[md5sum] = "5cfb7281c09a95c819c82bfa9aa5ab98"
SRC_URI[sha256sum] = "65d569b395bfffe3d6c16c0be0101248ed0052ef928129a04634667c5da5f4a6"

NPM_PKGNAME = "power-assert-context-formatter"

inherit npmhelper
inherit native

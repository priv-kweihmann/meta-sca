SUMMARY = "NPM: cross-spawn"
DESCRIPTION = "Cross platform child_process#spawn and child_process#spawnSync"
HOMEPAGE = "https://github.com/moxystudio/node-cross-spawn"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6046ffd2c9edcd9052bb4dd794d12f95"

DEPENDS = "npm-path-key-native \
           npm-shebang-command-native \
           npm-which-native"

SRC_URI = "https://registry.npmjs.org/cross-spawn/-/cross-spawn-7.0.3.tgz"
SRC_URI[md5sum] = "e8b91e2f179097df541bc96ebb11b8bf"
SRC_URI[sha256sum] = "11c58814090217e3effa2b4c28e0398683da87d6cb35441d846c2a38cf4a7205"

NPM_PKGNAME = "cross-spawn"

inherit npmhelper
inherit native

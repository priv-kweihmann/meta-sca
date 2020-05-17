SUMMARY = "NPM: cross-spawn"
DESCRIPTION = "Cross platform child_process#spawn and child_process#spawnSync"
HOMEPAGE = "https://github.com/moxystudio/node-cross-spawn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6046ffd2c9edcd9052bb4dd794d12f95"

DEPENDS = "npm-path-key-native \
           npm-shebang-command-native \
           npm-which-native"

SRC_URI = "https://registry.npmjs.org/cross-spawn/-/cross-spawn-7.0.2.tgz"
SRC_URI[md5sum] = "99f4e462fb1b08fbdb0c47b8a142f31e"
SRC_URI[sha256sum] = "bcf882a2aa79669bfb2b722a6aeb306ebe562790436fdfe5726b6ef3448717e1"

NPM_PKGNAME = "cross-spawn"

inherit npmhelper
inherit native

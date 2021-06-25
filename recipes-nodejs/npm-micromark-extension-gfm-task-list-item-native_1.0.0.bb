SUMMARY = "NPM: micromark-extension-gfm-task-list-item"
DESCRIPTION = "micromark extension to support GFM task list items"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-task-list-item#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-task-list-item/-/micromark-extension-gfm-task-list-item-1.0.0.tgz"
SRC_URI[md5sum] = "8fadfec34d4b14e185021ac54d03b6b1"
SRC_URI[sha256sum] = "7bcb8cecb925d8da8909d37edd65783abfe30904f7f0bceb4e6618048bbd5485"

NPM_PKGNAME = "micromark-extension-gfm-task-list-item"

inherit npmhelper
inherit native

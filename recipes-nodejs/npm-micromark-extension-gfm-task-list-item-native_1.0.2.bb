SUMMARY = "NPM: micromark-extension-gfm-task-list-item"
DESCRIPTION = "micromark extension to support GFM task list items"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-task-list-item#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-task-list-item/-/micromark-extension-gfm-task-list-item-1.0.2.tgz"
SRC_URI[md5sum] = "f73f3e5742a36ab1f901d6b6ccf95fe9"
SRC_URI[sha256sum] = "c2a6dbadb07043cf9aed1fe1d905d23dd2e48d63b5aab9501af11c6d2cc832fa"

NPM_PKGNAME = "micromark-extension-gfm-task-list-item"

inherit npmhelper
inherit native

SUMMARY = "NPM: micromark-extension-gfm-task-list-item"
DESCRIPTION = "micromark extension to support GFM task list items"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-task-list-item#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-power-assert-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-task-list-item/-/micromark-extension-gfm-task-list-item-1.0.1.tgz"
SRC_URI[md5sum] = "1b8acc774197aeec0f1e17d51ee7ce33"
SRC_URI[sha256sum] = "9076732bc685dcf7b83a42b0b583c94082b859c4c855051e222f9bd7b6736bb3"

NPM_PKGNAME = "micromark-extension-gfm-task-list-item"

inherit npmhelper
inherit native

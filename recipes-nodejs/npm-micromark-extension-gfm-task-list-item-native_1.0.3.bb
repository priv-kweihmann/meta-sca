SUMMARY = "NPM: micromark-extension-gfm-task-list-item"
DESCRIPTION = "micromark extension to support GFM task list items"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-task-list-item#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-task-list-item/-/micromark-extension-gfm-task-list-item-1.0.3.tgz"
SRC_URI[md5sum] = "b3af4dc747bf5227dc3b93c4c18438c1"
SRC_URI[sha256sum] = "9fe82fb4b371c876ac7a33fda3b9f8ce9a04c0570960989d61d8b2fe2369c3d0"

NPM_PKGNAME = "micromark-extension-gfm-task-list-item"

inherit npmhelper
inherit native

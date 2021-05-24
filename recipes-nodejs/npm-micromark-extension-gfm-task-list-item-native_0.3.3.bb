SUMMARY = "NPM: micromark-extension-gfm-task-list-item"
DESCRIPTION = "micromark extension to support GFM task list items"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-task-list-item#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-task-list-item/-/micromark-extension-gfm-task-list-item-0.3.3.tgz"
SRC_URI[md5sum] = "21fd91a305db89ec7b65f444d6abca0d"
SRC_URI[sha256sum] = "5bcd9849934244045da67b99e772adf3d23e99b57100d73b1ac0e476eeb71d4b"

NPM_PKGNAME = "micromark-extension-gfm-task-list-item"

inherit npmhelper
inherit native

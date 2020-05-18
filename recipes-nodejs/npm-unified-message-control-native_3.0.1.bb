SUMMARY = "NPM: unified-message-control"
DESCRIPTION = "Enable, disable, and ignore messages from unified processors"
HOMEPAGE = "https://github.com/unifiedjs/unified-message-control#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-unist-util-visit-native \
           npm-vfile-location-native"

SRC_URI = "https://registry.npmjs.org/unified-message-control/-/unified-message-control-3.0.1.tgz"
SRC_URI[md5sum] = "e61c6bc6616e5d1d99ff4d37bd268cbb"
SRC_URI[sha256sum] = "4fd9ffed85d801b8e642e897ac0a9bbe933716eb8bb3620c067715b6a5c10c9b"

NPM_PKGNAME = "unified-message-control"

inherit npmhelper
inherit native

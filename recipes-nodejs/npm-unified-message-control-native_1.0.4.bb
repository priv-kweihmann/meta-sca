SUMMARY = "NPM: unified-message-control"
DESCRIPTION = "Enable, disable, and ignore messages from unified processors"
HOMEPAGE = "https://github.com/unifiedjs/unified-message-control#readme"

DEPENDS = "npm-trim-native npm-unist-util-visit-native npm-vfile-location-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/unified-message-control/-/unified-message-control-1.0.4.tgz"
SRC_URI[md5sum] = "b819b08d6f9ff3a0e4a6d72861196e43"
SRC_URI[sha256sum] = "a9237d6ff934f370ae8483321d2683571087a17c2450672bb1485f7434bef86e"

NPM_PKGNAME = "unified-message-control"

inherit npmhelper
inherit native

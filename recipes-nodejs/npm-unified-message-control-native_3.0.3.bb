SUMMARY = "NPM: unified-message-control"
DESCRIPTION = "Enable, disable, and ignore messages from unified processors"
HOMEPAGE = "https://github.com/unifiedjs/unified-message-control#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-unist-util-visit-native \
           npm-vfile-location-native"

SRC_URI = "https://registry.npmjs.org/unified-message-control/-/unified-message-control-3.0.3.tgz"
SRC_URI[md5sum] = "d95dd97dc5134bf1c3d35bff72781ffe"
SRC_URI[sha256sum] = "d8697a0d871d0dd837afc6ff5fb2eedb18c07f486de2623528e31493f7c84c21"

NPM_PKGNAME = "unified-message-control"

inherit npmhelper
inherit native

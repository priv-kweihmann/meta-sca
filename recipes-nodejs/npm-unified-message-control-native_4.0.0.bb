SUMMARY = "NPM: unified-message-control"
DESCRIPTION = "Enable, disable, and ignore messages from unified processors"
HOMEPAGE = "https://github.com/unifiedjs/unified-message-control#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-native \
           npm-vfile-location-native \
           npm-vfile-message-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/unified-message-control/-/unified-message-control-4.0.0.tgz"
SRC_URI[md5sum] = "29008055aebe6ee668ad8c05791ebb0a"
SRC_URI[sha256sum] = "f5c9d8df81cff43827f704d1d330b3beb2132a2ea01bfa4d55db9592c57d7796"

NPM_PKGNAME = "unified-message-control"

inherit npmhelper
inherit native

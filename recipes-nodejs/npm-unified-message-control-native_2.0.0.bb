SUMMARY = "NPM: unified-message-control"
DESCRIPTION = "Enable, disable, and ignore messages from unified processors"
HOMEPAGE = "https://github.com/unifiedjs/unified-message-control#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-unist-util-visit-native \
           npm-vfile-location-native"

SRC_URI = "https://registry.npmjs.org/unified-message-control/-/unified-message-control-2.0.0.tgz"
SRC_URI[md5sum] = "bb76a58f80b1978ca9e986eb208d3217"
SRC_URI[sha256sum] = "8994d335505b293be24afe8bcb482257083eccb815b84f6f1330ee8f49f37903"

NPM_PKGNAME = "unified-message-control"

inherit npmhelper
inherit native

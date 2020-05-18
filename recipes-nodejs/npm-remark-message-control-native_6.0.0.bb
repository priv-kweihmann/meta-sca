SUMMARY = "NPM: remark-message-control"
DESCRIPTION = "remark plugin to enable, disable, and ignore messages with remark"
HOMEPAGE = "https://github.com/remarkjs/remark-message-control#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-mdast-comment-marker-native \
           npm-unified-message-control-native"

SRC_URI = "https://registry.npmjs.org/remark-message-control/-/remark-message-control-6.0.0.tgz"
SRC_URI[md5sum] = "6e440112f60584a15bcc8f6f98c28b0c"
SRC_URI[sha256sum] = "715977d9dea2ec08fd935a720bd8727b334c28a92fd1a8b20c370d108adbf46f"

NPM_PKGNAME = "remark-message-control"

inherit npmhelper
inherit native

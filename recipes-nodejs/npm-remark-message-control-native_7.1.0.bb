SUMMARY = "NPM: remark-message-control"
DESCRIPTION = "remark plugin to enable, disable, and ignore messages with remark"
HOMEPAGE = "https://github.com/remarkjs/remark-message-control#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-mdast-comment-marker-native \
           npm-types-mdast-native \
           npm-unified-message-control-native \
           npm-unified-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/remark-message-control/-/remark-message-control-7.1.0.tgz"
SRC_URI[md5sum] = "a49b0b0d532422a90c40a0af0cb2d84e"
SRC_URI[sha256sum] = "48c5b6eeaf5b78ccc7901e68111da64ff32974d7d393c8b5c14a44bcc4738e9f"

NPM_PKGNAME = "remark-message-control"

inherit npmhelper
inherit native

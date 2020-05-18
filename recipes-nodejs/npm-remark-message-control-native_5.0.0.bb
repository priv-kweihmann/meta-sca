SUMMARY = "NPM: remark-message-control"
DESCRIPTION = "remark plugin to enable, disable, and ignore messages with remark"
HOMEPAGE = "https://github.com/remarkjs/remark-message-control#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-mdast-comment-marker-native \
           npm-unified-message-control-native \
           npm-xtend-native"

SRC_URI = "https://registry.npmjs.org/remark-message-control/-/remark-message-control-5.0.0.tgz"
SRC_URI[md5sum] = "f62269d6af4d29bf9effe69d7a518c04"
SRC_URI[sha256sum] = "b54bd0ccf232178e023d1805032550f9e7aa9ed6bfb690506dbd171a2c1bb934"

NPM_PKGNAME = "remark-message-control"

inherit npmhelper
inherit native

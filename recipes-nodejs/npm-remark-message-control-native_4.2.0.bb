SUMMARY = "NPM: remark-message-control"
DESCRIPTION = "remark plugin to enable, disable, and ignore messages with remark"
HOMEPAGE = "https://github.com/remarkjs/remark-message-control#readme"

DEPENDS = "npm-mdast-comment-marker-native npm-unified-message-control-native npm-xtend-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

SRC_URI = "https://registry.npmjs.org/remark-message-control/-/remark-message-control-4.2.0.tgz"
SRC_URI[md5sum] = "0cf483de0cd43fc65ab3b51d4bba4152"
SRC_URI[sha256sum] = "a62a862d0ac4fb97693f00932916e261ea700c715d86b25441dee10ce4d02b38"

NPM_PKGNAME = "remark-message-control"

inherit npmhelper
inherit native

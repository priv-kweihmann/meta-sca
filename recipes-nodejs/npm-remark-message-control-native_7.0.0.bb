SUMMARY = "NPM: remark-message-control"
DESCRIPTION = "remark plugin to enable, disable, and ignore messages with remark"
HOMEPAGE = "https://github.com/remarkjs/remark-message-control#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-mdast-comment-marker-native \
           npm-rehype-native \
           npm-types-mdast-native \
           npm-unified-message-control-native \
           npm-unified-native \
           npm-vfile-native"

SRC_URI = "https://registry.npmjs.org/remark-message-control/-/remark-message-control-7.0.0.tgz"
SRC_URI[md5sum] = "82e7a3d6334f158ba09fe95d2cb63c43"
SRC_URI[sha256sum] = "a046e0947f8d075df5bc320ca87f9010114a4dcee23491703fb223a3a20cd3df"

NPM_PKGNAME = "remark-message-control"

inherit npmhelper
inherit native

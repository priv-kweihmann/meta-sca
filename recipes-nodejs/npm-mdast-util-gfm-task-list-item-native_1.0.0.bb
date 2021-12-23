SUMMARY = "NPM: mdast-util-gfm-task-list-item"
DESCRIPTION = "mdast extension to parse and serialize GFM task list items"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-task-list-item#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-task-list-item/-/mdast-util-gfm-task-list-item-1.0.0.tgz"
SRC_URI[md5sum] = "5fbd073bd799ce162896d6482d8fe67a"
SRC_URI[sha256sum] = "fcd58ce591a04a127e073a8afe6d38a8e0938d7dc5479b2f0a14d2236831da54"

NPM_PKGNAME = "mdast-util-gfm-task-list-item"

inherit npmhelper
inherit native

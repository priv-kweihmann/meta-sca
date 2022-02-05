SUMMARY = "NPM: mdast-util-gfm-task-list-item"
DESCRIPTION = "mdast extension to parse and serialize GFM task list items"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-task-list-item#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-task-list-item/-/mdast-util-gfm-task-list-item-1.0.1.tgz"
SRC_URI[md5sum] = "bfec9955f12280818666228fc3e0f740"
SRC_URI[sha256sum] = "6dbaf2f881935ebdc5bb8d0c193cf55108119606c2434d3eda605e54ad6ba147"

NPM_PKGNAME = "mdast-util-gfm-task-list-item"

inherit npmhelper
inherit native

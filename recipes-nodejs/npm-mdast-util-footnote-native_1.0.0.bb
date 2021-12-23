SUMMARY = "NPM: mdast-util-footnote"
DESCRIPTION = "mdast extension to parse and serialize footnotes"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-footnote#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-micromark-util-normalize-identifier-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-footnote/-/mdast-util-footnote-1.0.0.tgz"
SRC_URI[md5sum] = "833b987b7936c9d78f2fbd4bc1fcee4a"
SRC_URI[sha256sum] = "104ac420b0a8246ded8b6e3c6a0f9f4400525d83a6c262ca51307e9654f8be7a"

NPM_PKGNAME = "mdast-util-footnote"

inherit npmhelper
inherit native

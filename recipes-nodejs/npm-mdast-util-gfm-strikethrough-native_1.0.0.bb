SUMMARY = "NPM: mdast-util-gfm-strikethrough"
DESCRIPTION = "mdast extension to parse and serialize GFM strikethrough"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-strikethrough#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-strikethrough/-/mdast-util-gfm-strikethrough-1.0.0.tgz"
SRC_URI[md5sum] = "2b4f151c04461428c01d528268b8aa87"
SRC_URI[sha256sum] = "41f5f32a09e6d6b4a05ee4783b7a04abe2d5d842fcdb6162795b96aaa4e555d6"

NPM_PKGNAME = "mdast-util-gfm-strikethrough"

inherit npmhelper
inherit native

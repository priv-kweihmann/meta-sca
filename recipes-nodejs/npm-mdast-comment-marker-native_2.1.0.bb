SUMMARY = "NPM: mdast-comment-marker"
DESCRIPTION = "mdast utility to parse a comment marker"
HOMEPAGE = "https://github.com/syntax-tree/mdast-comment-marker#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-mdast-util-mdx-expression-native"

SRC_URI = "https://registry.npmjs.org/mdast-comment-marker/-/mdast-comment-marker-2.1.0.tgz"
SRC_URI[md5sum] = "33b33e5d548997d77b9d94f232449ab4"
SRC_URI[sha256sum] = "a8ef2a0b36928e67a69a30ac055466e778577c3a2a84585536401ab9bc8dd644"

NPM_PKGNAME = "mdast-comment-marker"

inherit npmhelper
inherit native

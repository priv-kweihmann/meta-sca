SUMMARY = "NPM: mdast-util-gfm-strikethrough"
DESCRIPTION = "mdast extension to parse and serialize GFM strikethrough"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-strikethrough#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-strikethrough/-/mdast-util-gfm-strikethrough-0.2.3.tgz"
SRC_URI[md5sum] = "140ca9b582c726cda2a5468533e0d564"
SRC_URI[sha256sum] = "172a22b41e8a26352926d0c3c5b4f83c40872bc5b94cda1609335677a3af384a"

NPM_PKGNAME = "mdast-util-gfm-strikethrough"

inherit npmhelper
inherit native

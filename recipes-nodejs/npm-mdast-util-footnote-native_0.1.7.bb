SUMMARY = "NPM: mdast-util-footnote"
DESCRIPTION = "mdast extension to parse and serialize footnotes"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-footnote#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-micromark-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-footnote/-/mdast-util-footnote-0.1.7.tgz"
SRC_URI[md5sum] = "f10d43a55c37fcb44915fbf38838dfd5"
SRC_URI[sha256sum] = "2a44776bae0c360c64c5cb2a3438c772c69a212acca29d0373942700013a891b"

NPM_PKGNAME = "mdast-util-footnote"

inherit npmhelper
inherit native

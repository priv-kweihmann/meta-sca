SUMMARY = "NPM: mdast-util-gfm-autolink-literal"
DESCRIPTION = "mdast extension to parse and serialize GFM autolink literals"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-autolink-literal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-ccount-native \
           npm-mdast-util-find-and-replace-native \
           npm-micromark-util-character-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-autolink-literal/-/mdast-util-gfm-autolink-literal-1.0.1.tgz"
SRC_URI[md5sum] = "d01de2845d660472f909001024c820b8"
SRC_URI[sha256sum] = "d1729ab79b859a75c843222abca366e5db811854c16fdf2bcb23c3d0a1cb4101"

NPM_PKGNAME = "mdast-util-gfm-autolink-literal"

inherit npmhelper
inherit native
